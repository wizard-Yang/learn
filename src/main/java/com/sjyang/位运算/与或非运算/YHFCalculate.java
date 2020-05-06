package com.sjyang.位运算.与或非运算;

/**
 * @author saijun.yang
 * @date 2020/1/9 10:45
 * @description 与或非运算，都是转化为2进制的运算
 */
public class YHFCalculate {
    public static void main(String[] args) {
        /**
         * 首先是正数转化为二进制
         * 然后是小数转化为二进制（乘2法）
         *      例如0.1
         *      0.1*2 = 0.2 不大于等于1 记0
         *      0.2*2 = 0.4 记0
         *      0.4*2 = 0.8 记0
         *      0.8*2 = 1.6 记1 余0.6
         *      一直乘下去，直到小数位为0，有时可能一直不等于0，因此就要保留几位了
         *      所以0.1的二进制为0.001...
         */
        int i = 13;
        int j = 12;
        String erJinZhi = Integer.toBinaryString(i);
        String erJinZhiJ = Integer.toBinaryString(j);
        System.out.println(erJinZhi);
        System.out.println(erJinZhiJ);
        //与运算，必须全为1
        System.out.println(i&j);
        //或运算，有一个为1
        System.out.println(i | j);
        //非运算，取反
        System.out.println(~i);
        System.out.println(~j);

    }
}
