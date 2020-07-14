package thread.试题;

import java.util.concurrent.TimeUnit;

/**
 * @author saijun.yang
 * @date 2020/5/7 16:24
 * @description 现在有线程 T1、T2 和 T3。你如何确保 T2 线程在 T1 之后执行，
 * 并且 T3 线程在 T2 之后执行？
 * 答案：使用Thread中的join方法。
 * 记住join在本代码中，调用时让main现在在等待T1完成，然后T2、T3
 */
public class Solution01 {
    public static void main(String[] args) throws InterruptedException {
        Thread T1 = new Thread(() -> {
            System.out.println("T1");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T11");
        },"T1");

        Thread T2 = new Thread(() -> {
            System.out.println("T2");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T22");

        },"T2");

        Thread T3 = new Thread(() -> {
            System.out.println("T3");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T33");
        },"T3");
        T1.start();
        T1.join();
        T2.start();
        T2.join();
        T3.start();
        T3.join();
    }
}
