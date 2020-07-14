package com.sjyang.基本数据类型.doubleTest;

import java.math.BigDecimal;

/**
 * @author saijun.yang
 * @date 2020/5/6 19:46
 * @description double精度相关问题
 */
public class DoubleParse {
    public static void main(String[] args) {
        double a = 1000000000;
        double b = 2000000000;
        Double c = a+b;
        System.out.println(new BigDecimal(c).toString());
    }
}
