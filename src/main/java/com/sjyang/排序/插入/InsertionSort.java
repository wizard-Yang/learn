package com.sjyang.排序.插入;

/**
 * @author saijun.yang
 * @date Created in 2019/9/25 14:32
 * @description 插入排序
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2,5,6,3,4,8,7};
        //function(arr);
        function2(arr);
    }

    public static void function(int[] arr){
        //第二个元素需要比较一次，第三个元素需要比较两次，由此可见比较次数与i有关
        //因为是后面与前面的比较，因此for循环逆序
        for (int i = 1; i < arr.length; i++) {//从第二个元素开始比较
            int ele = arr[i];
            int j = i-1;
            for (; j >= 0 ; j--) {//每次需要比较i-1次，请记住这个j--最后换位置和她有关
                if(arr[j] > ele){
                    //换位置
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = ele;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+";");
        }
    }
    public static void function2(int[] array) {
        if (array.length == 0){
            System.out.println("数组为空");
        }
        int current;
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+";");
        }
    }
}
