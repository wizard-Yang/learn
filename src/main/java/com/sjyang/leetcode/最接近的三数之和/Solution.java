package com.sjyang.leetcode.最接近的三数之和;

import java.util.Arrays;

/**
 * @author saijun.yang
 * @date 2020/4/26 8:57
 * @description 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。
 * 找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 * <p>
 * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
 * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {0 ,1, 2};
        int target = 5;
        System.out.println("最接近的和为" + threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        //结果值
        int sumClosest = nums[0] + nums[1] + nums[2];
        //数组长度
        int numsLenth = nums.length;
        int left = 0;
        int right = 0;
        sumClosest = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < numsLenth; i++) {
            left = i + 1;
            right = numsLenth - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(Math.abs(target - sum) < Math.abs(target - sumClosest)){
                    sumClosest = sum;
                    System.out.println("["+nums[i] +"]["+ nums[left] +"]["+ nums[right]+"]");
                }
                if(sum > target){
                    right-- ;
                }else if(sum < target){
                    left++;
                }else{
                    return sumClosest;
                }
            }
        }
        return sumClosest;
    }
}
