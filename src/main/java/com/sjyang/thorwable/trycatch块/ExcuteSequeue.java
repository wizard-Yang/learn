package com.sjyang.thorwable.trycatch块;

/**
 * @author saijun.yang
 * @date Created in 2019/12/30 19:10
 * @description 捕捉异常执行顺序
 */
public class ExcuteSequeue {
    public static void main(String[] args) {
        System.out.println(getNum());
    }

    public static int getNum(){
        int a = 0;
        try {
            a+=5;
            return a;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            a+=20;
            return a;
        }
    }
}
