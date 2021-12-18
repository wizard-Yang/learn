package com.sjyang.精度计算;

import java.math.BigDecimal;

/**
 * @author saijun.yang
 * @date 2021/7/14 9:42
 * @description 乘法精度
 */
public class Multi {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("1.15");
        BigDecimal b2 = new BigDecimal("0.4");
        System.out.println(b1.multiply(b2).doubleValue());
    }
}
