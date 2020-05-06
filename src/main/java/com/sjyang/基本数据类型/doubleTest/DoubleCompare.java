package com.sjyang.基本数据类型.doubleTest;

/**
 * @author saijun.yang
 * @date 2020/3/17 14:30
 * @description 比较两个double类型数值大小
 */
public class DoubleCompare {
    public static void main(String[] args) {
        double a = 1.1;
        double b = 1.10;
        System.out.println(a == b);//true
        Double c = 1.1;
        Double d = 1.10;
        System.out.println(c == d);//false
        System.out.println(c.compareTo(d));
        System.out.println(d);
    }
}
