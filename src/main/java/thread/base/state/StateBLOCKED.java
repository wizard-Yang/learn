package thread.base.state;

import java.util.concurrent.TimeUnit;

/**
 * @author saijun.yang
 * @date 2020/3/24 13:26
 * @description BLOCKED 阻塞状态
 */
public class StateBLOCKED {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (StateBLOCKED.class){
                    while(true){

                    }
                    //TimeUnit.SECONDS.sleep(4);
                }
            }
        });
        thread.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (StateBLOCKED.class){
                    System.out.println("等到了锁");
                }
            }
        });
        thread2.start();
        TimeUnit.SECONDS.sleep(2);
        System.out.println(thread.getState());//RUNNABLE
        System.out.println(thread2.getState());//BLOCKED
    }
}
