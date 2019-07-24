package com.sjyang.数字;

import java.math.BigDecimal;

/**
 * @author saijun.yang
 * @date Created in 2019/7/15 15:35
 * @description 出发精度
 * @modified By
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        /*BigDecimal b1 = new BigDecimal(11);
        BigDecimal b2 = new BigDecimal(3);
        BigDecimal result = b1.divide(b2,2,BigDecimal.ROUND_HALF_UP);
        System.out.println(result);*/
        String t1 = "40000";
        String t2 = "40000.0";
        System.out.println(Double.valueOf(t1)==Double.valueOf(t2));
        System.out.println(new BigDecimal(t1).compareTo(new BigDecimal(t2)));
    }
}
