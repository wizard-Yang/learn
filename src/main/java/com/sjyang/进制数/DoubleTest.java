package com.sjyang.进制数;

/**
 * @author saijun.yang
 * @date Created in 2019/12/6 16:27
 * @description
 */
public class DoubleTest {
    public static void main(String[] args) {
        double a = 1.0;
        String num = "30";
        double b = Double.parseDouble(num)/30;
        System.out.println(a == b);
        System.out.println(28/30);
    }
}
