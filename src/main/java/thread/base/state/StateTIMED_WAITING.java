package thread.base.state;

import java.sql.Time;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/**
 * @author saijun.yang
 * @date 2020/3/24 14:40
 * @description TIMED_WAITING 超时等待
 */
public class StateTIMED_WAITING {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(2000);
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t.start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println(t.getState());//TIMED_WAITING
    }
}
