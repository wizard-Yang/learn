package com.sjyang.wrapper;

/**
 * @author ：saijun.yang
 * @date ：Created in 2019/4/28 15:32
 * @description：Wrapper设计模式，
 * 1. 实现某个接口
 * 2. 依赖该接口的子类, 并通过接口方法访问子类对象的方法
 * @modified By：
 * @version:
 */
public class Wrapper {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程正在执行中...");
                try {
                    Thread.sleep(90000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        System.out.println(thread.getState());
    }

}
