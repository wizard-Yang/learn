package com.sjyang.thorwable.catch中抛出异常;

import java.util.concurrent.TimeUnit;

/**
 * @author saijun.yang
 * @date 2021/3/3 10:16
 * @description 在catch中抛出异常信息
 */
public class ThrowExceptionInCatch {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    int a = 1/0;
                } catch (Exception e) {
                    System.out.println("进入异常，即将抛出");
                    throw new RuntimeException("运行时异常");
                } finally {
                    System.out.println("finally块");
                }
            }
        }).start();
    }
}
