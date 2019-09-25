package com.sjyang.排序.选择;

/**
 * @author saijun.yang
 * @date Created in 2019/9/25 15:35
 * @description 选择排序
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,5,6,3,4,8,7};
        function(arr);
    }

    public static void function(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //找到最小的或者最大的
            int minIndex = i;
            for (int j = i; j < arr.length ; j++) {
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            //因为每次都能找到最大或者最小，因为根据i换位置就可以
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+";");
        }
    }
}
