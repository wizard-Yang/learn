package com.sjyang.leetcode.求众数2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author saijun.yang
 * @date 2021/10/22 14:50
 * @description 力扣229题
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3};
        System.out.println(majorityElement(nums));
    }
    public static List<Integer> majorityElement(int[] nums) {
        //思路，数组排序，然后比较
        int length = nums.length;
        int n = length/3;
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<Integer>();
        if(length == 1){
            list.add(nums[0]);
            return list;
        }
        int temp = 0;
        for(int i = 0;i < length - 1; i++){
            if(nums[i] == nums[i+1]){
                temp+=2;
                i++;
                if(i == length -2){
                    ++temp;
                    if(temp > n){
                        list.add(nums[i]);
                        return list;
                    }
                }
            }else{
                if(n == 0){
                    list.add(nums[0]);
                    list.add(nums[1]);
                    return list;
                }
                if(temp > n){
                    list.add(nums[i]);
                }
                temp = 0;
            }
        }
        return list;
    }
}
