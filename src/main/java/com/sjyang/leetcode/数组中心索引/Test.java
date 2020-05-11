package com.sjyang.leetcode.数组中心索引;

import java.util.Random;

/**
 * @author saijun.yang
 * @date Created in 2019/8/21 16:40
 * @description 寻找数组中心索引
 * 数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
 * 没有返回-1
 * 有多个，选择最靠近左边的。
 * @modified By
 */
public class Test {
    public static void main(String[] args) {
        //造一个长度未0~10000的数组，数字未-1000~1000
        Random random = new Random();
        int capacity = random.nextInt(10000);
        System.out.println("数组长度为："+capacity);
        int[] array = new int[capacity];
        System.out.println("将数组打印，并且每20个换行");
        for (int i = 0; i < capacity; i++) {
            array[i] = random.nextInt(2000)-1000;
            if(i%20 != 0 || i == 0){
                System.out.print(array[i]+",");
            }else{
                System.out.print(array[i]+",");
                System.out.println("");
            }
        }

        System.out.println("数组的中心索引为："+pivotIndex(array));

    }
    /**
     * @param nums 的长度范围为 [0, 10000]。
     *  任何一个 nums[i] 将会是一个范围在 [-1000, 1000]的整数。
     * @return
     */
    public static int pivotIndex(int[] nums) {
        return 0;
    }
}
