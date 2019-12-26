package com.sjyang.基础题.数字;

/**
 * @author saijun.yang
 * @date Created in 2019/12/12 14:00
 * @description
 */
public class DoubleCompare {
    public static void main(String[] args) {
        Double a = 1.0;
        Double b = 1.0;
        double a1 = a.doubleValue();
        double b1 = b.doubleValue();
        System.out.println(a1 == b1);
        double c = 2.0;
        double d = 2.0;
        System.out.println(c == d);
        Double e = 0.0;
        System.out.println(e == 0.0);
    }
}
