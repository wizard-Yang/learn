package com.sjyang.算法.寻找两个有序数组的中位数;

/**
 * @author saijun.yang
 * @date Created in 2019/7/24 16:12
 * @description 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * 提示：一般logn的时间复杂度都是二分法进行的
 * 你可以假设 nums1 和 nums2 不会同时为空。
 * 示例 1:
 * nums1 = [1, 3]
 * nums2 = [2]
 * 则中位数是 2.0
 * 示例 2:
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * 则中位数是 (2 + 3)/2 = 2.5
 * @modified By
 */
public class Test {
    public static void main(String[] args) {
        int[] nums1 =  {1, 3};
        int[] nums2 =  {2, 9};
        System.out.println("中位数为："+findMedianSortedArrays(nums1,nums2));
    }
    /**
     * 暴力法：将两个数组合并为一个数组排序，判断是奇数还是偶数
     * JDK中有数组合并方法
     * @param nums1
     * @param nums2
     * @return
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int totalNum = len1+len2;
        int[] total = new int[totalNum];
        //判断两个数组是否有为空的，有的话直接对另外一个数组取中位数
        if(len1 == 0){
            if((len2 % 2) > 0){//如果为奇数
                return nums2[len2/2];
            }else{//为偶数
                return ((double)(nums2[len2/2]+nums2[len2/2-1]))/2;
            }
        }
        if(len2 == 0){
            if((len1 % 2) > 0){//如果为奇数
                return nums1[len1/2];
            }else{//为偶数
                return ((double)(nums1[len1/2]+nums1[len1/2-1]))/2;
            }
        }
        //都不为空时，将数组重组到一个新数组中
        int i = 0;
        int j = 0;
        int count = 0;
        while(count != totalNum){
            if(i == len1){
                while(j != len2){
                    total[count] = nums2[j];
                    j++;
                    count++;
                }
                break;
            }
            if(j == len2){
                while(i != len1){
                    total[count] = nums1[i];
                    i++;
                    count++;
                }
                break;
            }

            if(nums1[i] > nums2[j]){
                total[count] = nums2[j];
                j++;
            }else{
                total[count] = nums1[i];
                i++;
            }
            count = i + j;
        }

        //判断重组的数组是奇数还是偶数从而求得中位数
        if((totalNum % 2) > 0){//如果为奇数
            return total[totalNum/2];
        }else{//为偶数
            return ((double)(total[totalNum/2]+total[totalNum/2-1]))/2;
        }
    }


    public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        return 0d;
    }
}
