package thread.juc.locks.AQS;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.LockSupport;

/**
 * @author saijun.yang
 * @date 2020/5/7 18:19
 * @description 自定义实现一个AQS
 * 纯java不借用中间件的公平锁。
 */
public class SjyangAQS {
    public static void main(String[] args) {
        SjyangAQS sjyangAQS = new SjyangAQS();
        sjyangAQS.compareAndSwapState(0,1);
        System.out.println(sjyangAQS.state);
    }
    //公共资源
    private volatile int state = 0;
    //当前持有锁的线程
    private Thread lockHolder;
    private static Unsafe unsafe = null;
    //公共资源内存偏移量
    private static long offset;
    //线程安全的队列（别用阻塞队列，因为底层就是AQS。）
    private final ConcurrentLinkedQueue<Thread> waiters = new ConcurrentLinkedQueue<>();

    /**
     * 获取公共资源在内存中的偏移量
     */
    static{
        try {
            Field f = Unsafe.class.getDeclaredField("theUnsafe");
            f.setAccessible(true);
            unsafe = (Unsafe) f.get(null);
            offset = unsafe.objectFieldOffset(SjyangAQS.class.getDeclaredField("state"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final boolean compareAndSwapState(int expect,int update){
        return unsafe.compareAndSwapInt(this,offset,expect,update);
    }

    /**
     *  加锁
     */
    public void lock(){
        if(aquire()){
            return;
        }
        //未拿到锁，正常使用时，线程应该困在该方法中。放入队列中等待
        Thread t = Thread.currentThread();
        waiters.add(t);
        //空跑浪费资源
        for (;;) {
            //每次被唤醒都会继续去尝试获取锁,peek获取队头元素
            if(waiters.peek() == t && aquire()){
                waiters.poll();//把队头移除
                return;
            }
            //阻塞住
            LockSupport.park();
        }
    }
    //解锁
    public void unlock() {
        //判断当前线程是不是持有锁的线程
        if(lockHolder == Thread.currentThread()){
            int state = this.state;
            if(compareAndSwapState(1,0)){
                lockHolder = null;
                Thread current = waiters.peek();//取到队首
                if(current != null){
                    LockSupport.unpark(current);
                }
            }
        }else{
            throw new RuntimeException("当前线程未持有锁，无法解锁异常");
        }
    }

    //尝试获取锁
    private boolean aquire(){
        //当前未加锁，cas
        if(this.state == 0){
            //为了实现公平锁，需要以队列为主
            if((waiters.size() == 0 || Thread.currentThread() == waiters.peek())&& compareAndSwapState(0,1)){
                lockHolder = Thread.currentThread();//加锁成功，当前线程持有锁
                return true;
            }
        }
        return false;
    }
}
