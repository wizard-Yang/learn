package com.sjyang.排序.冒泡;

/**
 * @author saijun.yang
 * @date Created in 2019/9/25 14:18
 * @description 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,5,6,3,4,8,7};
        function(arr);
    }

    public static void function(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+";");
        }
    }
}
