package com.sjyang.基础题.数字.数字的极限值;

/**
 * @author saijun.yang
 * @date Created in 2019/8/22 11:40
 * @description:测试一下数字的极限值
 * 当最大值溢出1后，变为了最小值
 * 最小值减去1后变为了最大值
 * @modified By
 */
public class Test {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println(max+1);
        System.out.println(min-1);
    }
}
