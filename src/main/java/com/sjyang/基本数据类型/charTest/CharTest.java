package com.sjyang.基本数据类型.charTest;

/**
 * @author saijun.yang
 * @date 2020/5/13 10:09
 * @description
 */
public class CharTest {
    public static void main(String[] args) {
        char a1 = 'a';
        char a2 = 'b';
        int c = a1+a2;
        //这样会直接将他们代表的数字值相加：195
        System.out.println((a1)+String.valueOf(a2));
    }
}
