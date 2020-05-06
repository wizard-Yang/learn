package com.sjyang.leetcode.盛最多水;

/**
 * @author saijun.yang
 * @date 2020/4/23 9:14
 * @description 盛最多水的容器
 * 解决方案：双指针算法
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 */
public class Solution {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = maxArea(height);
        System.out.println("最多盛水："+result);
    }

    public static int maxArea(int[] height) {
        int max = 0;
        int maxLeft = 0;
        int maxRight = 0;
        int leftIndex = 0;
        int rightIndex = 0;
        int index = height.length-1;
        for (int i = 0; i < index; ) {
            leftIndex = height[i];
            rightIndex = height[index];
            int bigger = rightIndex >= leftIndex ? leftIndex : rightIndex;
            int area = (index-i) * bigger;
            if(area > max){
                max = area;
                maxLeft = leftIndex;
                maxRight = rightIndex;
            }
            if(rightIndex > leftIndex){
                i++;
            }else if(rightIndex == leftIndex){//优化，当左右相等时，哪边移动肯定都是比这个当前相等这个面积小
                i++;
                index--;
            }else{
                index--;
            }
        }
        System.out.println("最大值时，左边为"+maxLeft+";右边为："+maxRight);
        return max;
    }

    public int maxArea1(int[] height) {
        int l = 0, r = height.length - 1;
        int ans = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(ans, area);
            if (height[l] <= height[r]) {
                ++l;
            }
            else {
                --r;
            }
        }
        return ans;
    }
}
