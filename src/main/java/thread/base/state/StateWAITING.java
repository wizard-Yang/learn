package thread.base.state;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.concurrent.TimeUnit;

/**
 * @author saijun.yang
 * @date 2020/3/24 13:39
 * @description WAITING 等待状态
 * 当执行：
 * Object.wait()
 * Thread.join()
 * LockSupport.park()
 * 方法时，此时状态为等待状态，直到调用
 * Object.notifyAll()
 * 等待结束
 * LockSupport.unpark(thread)
 */
public class StateWAITING {
    public static void main(String[] args) throws InterruptedException {
        /*使用join实现等待状态*/
        Thread thread = new Thread(() -> {
            try {
                System.out.println("开始休眠A");
                TimeUnit.SECONDS.sleep(7);
                System.out.println("休眠结束A");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"A");
        Thread thread2 = new Thread(() -> {
            try {
                System.out.println("开始休眠B");
                thread.join();
                TimeUnit.SECONDS.sleep(3);
                System.out.println("休眠结束B");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"B");
        thread.start();
        thread2.start();
        while(true){
            TimeUnit.SECONDS.sleep(1);
            System.out.println("A的线程状态"+thread.getState());
            System.out.println("B的线程状态"+thread2.getState());
        }
    }
}

