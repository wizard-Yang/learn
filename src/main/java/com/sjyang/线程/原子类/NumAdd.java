package com.sjyang.线程.原子类;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author saijun.yang
 * @date Created in 2019/9/17 15:39
 * @description 两个线程数字累加-使用原子工具类
 */
public class NumAdd {
    private static AtomicInteger count = new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException {
        //创建两个线程
        for (int i = 0; i < 2; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    for (int j = 0; j < 100; j++) {
                        count.incrementAndGet();
                    }
                }
            }).start();
        }
        Thread.sleep(5000);
        System.out.println(count);
    }
}
