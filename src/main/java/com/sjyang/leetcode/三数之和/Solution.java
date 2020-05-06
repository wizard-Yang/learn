package com.sjyang.leetcode.三数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author saijun.yang
 * @date 2020/4/24 8:50
 * @description 三数之和
 * 解决思路：数组排序+小的滑动窗口
 * 1.数组排序
 * 2.选定第一个数字开始，找出其左右数字相加是否为0
 * 3.循环遍历下去，直到数组结束
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> groupResultList = threeSum(nums);
        for (List<Integer> integers : groupResultList) {
            System.out.println(integers.toString());
        }
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> groupResultList = new ArrayList<>();
        //如果数组长度少于3，则返回空值
        if(nums.length <= 2) return groupResultList;
        //先排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            //去重，nums[i]和下一个数字相同，那么可能出现查找一致的情况
            if(i > 0 && nums[i] == nums[i-1])continue;
            int rightIndex = nums.length-1;
            int leftIndex = i+1;
            while(leftIndex < rightIndex){
                int sum = nums[i]+nums[leftIndex]+nums[rightIndex];
                if(sum == 0){
                    groupResultList.add(Arrays.asList(nums[i],nums[leftIndex],nums[rightIndex]));
                    //优化部分-如果相邻数字相同，那么移动可以多一步
                    while(leftIndex < rightIndex && nums[leftIndex] == nums[leftIndex+1])leftIndex++;
                    while(leftIndex < rightIndex && nums[rightIndex] == nums[rightIndex-1])rightIndex--;

                    //因为此时等于0了，对于左边的值肯定需要右移，右边左移，这样才可能继续出现等于0的情况
                    rightIndex--;
                    leftIndex++;
                }else if(sum > 0){//大于零肯定是因为右边数过大，所以右边移动
                    rightIndex--;
                }else if(sum < 0){//小于0肯定左边数字太小，左边移动
                    leftIndex++;
                }
            }
        }
        return groupResultList;
    }

    public static List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        int len = nums.length;
        if(nums == null || len < 3) return ans;
        Arrays.sort(nums); // 排序
        for (int i = 0; i < len ; i++) {
            //if(nums[i] > 0) break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
            if(i > 0 && nums[i] == nums[i-1]) continue; // 去重
            int L = i+1;
            int R = len-1;
            while(L < R){
                int sum = nums[i] + nums[L] + nums[R];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    //while (L<R && nums[L] == nums[L+1]) L++; // 去重
                    //while (L<R && nums[R] == nums[R-1]) R--; // 去重
                    L++;
                    R--;
                }
                else if (sum < 0) L++;
                else if (sum > 0) R--;
            }
        }
        return ans;
    }

}
