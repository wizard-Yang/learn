package com.sjyang.leetcode.设计n次幂函数;

/**
 * @author saijun.yang
 * @date 2020/5/11 14:15
 * @description 设计一个n次幂函数pox(x,y)计算x的y次幂
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(myPow(2,3));
    }
    public static double myPow(double x, int n) {
        return Math.pow(x,n);
    }
}
