package com.sjyang.排序;

/**
 * @author ：saijun.yang
 * @date ：Created in 2019/5/15 8:41
 * @description：冒泡排序
 * 冒泡的思想是比较完成后，进行数据交换位置
 * 每次排序都能找到一个最大或者最小的
 * 优化思想：
 *     1.每次排序完成后可以少排序一次了
 *     2.如果没有要移动的元素就可以退出了。
 * @modified By：
 * @version:
 */
public class Maopao {
    public static void main(String[] args) {
        int[] arr = {4,1,5,9,2,7,8,0,4};
        int len = arr.length;
        arr = pra1(arr);

        for(int mer:arr){
            System.out.print(mer+",");
        }

    }

    /**
 * 简单实现
 * @param arr
 * @param len
 */
public static int[] method1(int[] arr,int len){
    for (int i = 0; i < len; i++) {
        for (int j = 0; j < len-1; j++) {
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        System.out.println("第"+(i+1)+"次排序后的结果");
        System.out.print("{");
        for (int j = 0; j < len; j++) {
            System.out.print(arr[j]+",");
        }
        System.out.print("}");
    }
    return arr;
}

    /**
     * 优化
     * 1.因为i每次在j执行完一次之后，都最终有一个数不需要比较了，因为它达到了自己的正确位置
     * 所以j可以随着i增大，比较次数减少。
     * 2.如果在比较时，发现没有可移动的元素时，可以直接退出
     * @param arr
     * @param len
     * @return
     */
    public static int[] method2(int arr[],int len){
        for (int i = 0; i < len; i++) {
            boolean flag = false;
            for (int j = 0; j < len-i-1; j++) {//每次减少一次比较
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
        return arr;
    }

    public static int[] pra1(int[] arr){
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < (len-i-1); j++) {
                if(arr[j] > arr[j+1]){
                    int tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;
                }
                
            }
        }
        return arr;
    } 
}
