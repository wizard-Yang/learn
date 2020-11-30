package com.sjyang.基本数据类型.doubleTest;

import java.math.BigDecimal;

/**
 * @author saijun.yang
 * @date 2020/3/17 14:30
 * @description 比较两个double类型数值大小
 */
public class DoubleCompare {
    public static void main(String[] args) {
        /*double a = 1.1;
        double b = 1.10;
        System.out.println(a == b);//true
        double a1 = 0.01;
        double b1 = 0.010;
        System.out.println(a1 == b1);//true
        Double c = 1.1;
        Double d = 1.10;
        System.out.println(c == d);//false
        System.out.println(c.compareTo(d));//0
        System.out.println(d);*/


        BigDecimal bigDecimal = new BigDecimal("0.04");
        double a = 0;
        double b = 5;
        System.out.println(bigDecimal.doubleValue() > a && bigDecimal.doubleValue() < b );
    }
}
