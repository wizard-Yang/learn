package thread.base.state;

import java.util.concurrent.TimeUnit;

/**
 * @author saijun.yang
 * @date 2020/3/24 13:21
 * @description 运行状态
 */
public class StateRUNABLE {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread();
        t.start();
        System.out.println(t.getState());//RUNNABLE
        TimeUnit.SECONDS.sleep(2);
        System.out.println(t.getState());//TERMINATED
    }
}
