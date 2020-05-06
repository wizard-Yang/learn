package com.sjyang.leetcode.数组中的逆序对;

/**
 * @author saijun.yang
 * @date 2020/4/24 10:36
 * @description 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数
 * 输入: [7,5,6,4]
 * 输出: 5
 * 限制：0 <= 数组长度 <= 50000
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {-185,143,-154,-338,-269,287,214,313};
        System.out.println(reversePairs1(nums));
    }

    /**
     * 暴力法-肯定时间复杂度太高了O(n^2)
     * @param nums
     * @return
     */
    public static int reversePairs1(int[] nums) {
        long start = System.currentTimeMillis();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] > nums[j]){
                    result++;
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end-start));
        return result;
    }
}
