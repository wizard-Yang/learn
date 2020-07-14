package com.sjyang.基本数据类型.doubleTest;

import java.math.BigDecimal;

/**
 * @author saijun.yang
 * @date 2020/6/3 13:31
 * @description
 */
public class DoubleAdd {
    public static void main(String[] args) {
        Double a = 0.1;
        Double b = 0.2;
        BigDecimal aa = new BigDecimal(a.toString());
        BigDecimal bb = new BigDecimal(b.toString());

        double c = a+b;
        //System.out.println(c);
        //System.out.println(aa.add(bb));

        //判断大小
        BigDecimal big = new BigDecimal("40");
        BigDecimal small = new BigDecimal("50");
        System.out.println(big.compareTo(small));

    }
}
