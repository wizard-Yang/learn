package thread.juc.concurrent包下工具.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * @author saijun.yang
 * @date 2020/3/23 10:18
 * @description 带返回值的线程实现接口
 * 问题遗留：线程池启动多线程，call方法抛出的异常能否被捕获到？
 */
public class CallableTest{
    public static void main(String[] args) {
        FutureTask futureTask1 = new FutureTask(new Resource1(),null);
        FutureTask futureTask2 = new FutureTask(new Resource2());
        new Thread(futureTask1,"A").start();
        new Thread(futureTask2,"B").start();
        try {
            System.out.println(futureTask1.get());
            System.out.println(futureTask2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
/**
 * 资源类
 */
class Resource1 implements Runnable{
    //不可以抛出异常
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("睡醒了"+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Resource2 implements Callable{
    //可以抛出异常
    @Override
    public Object call() throws Exception {
        TimeUnit.SECONDS.sleep(1);
        System.out.println("睡醒了"+Thread.currentThread().getName());
        System.out.println(2/0);
        return Thread.currentThread().getName();
    }
}
