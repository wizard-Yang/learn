package com.sjyang.精度计算;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author saijun.yang
 * @date 2020/4/24 14:00
 * @description 除法保留两位小数
 */
public class BigdecimalDemo {
    public static void main(String[] args) {
        Double dou = new Double(501111111);
        BigDecimal bigDecimal = new BigDecimal(dou);
        System.out.println(bigDecimal.divide(new BigDecimal(100000000),2, RoundingMode.HALF_UP));
    }
}
