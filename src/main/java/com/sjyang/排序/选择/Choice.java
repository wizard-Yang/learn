package com.sjyang.排序.选择;

/**
 * @author ：saijun.yang
 * @date ：Created in 2019/5/16 9:41
 * @description：选择排序
 * 核心思想：他是在未排序的数组中，选择最小的元素
 * 然后进行数据交换。和插入排序一样，同样分为两个数组，最开始左侧排序数组元素即为第一个元素
 * 然后在剩下的元素中找到最小的，与其进行数据交换
 *核心思想：使用下标，找到最小的，然后和当前i进行交换,因为前面已经排序完成
 * @modified By：
 * @version:
 */
public class Choice {
    public static void main(String[] args) {
        int arr[] = {3,4,8,2,1,7,10,5};
        arr = choice(arr);
        for (int ele:arr){
            System.out.print(ele+",");
        }
    }

    public static int[] choice(int[] arr){
        int len = arr.length;
        int min = 0;
        //因为选择最小的进行数据交换，因此只需交换len-1次
        for (int i = 0; i < len-1 ; i++) {
            min = i;
            //开始选择最小的数，注：第一个还是作为左侧第一个元素
            for (int j = min+1; j < len; j++) {
                if(arr[min] > arr[j]){//找到最小的元素的下标
                    min = j;
                }
            }
            //将最小元素与前面进行替换
            if(i != min){
                arr[i] = arr[i]+arr[min];
                arr[min] = arr[i] - arr[min];
                arr[i] = arr[i] - arr[min];
            }
        }
        return arr;
    }

    public static int[] pra1(int[] arr){
        int len = arr.length;
        int min = 0;
        for (int i = 0; i < len; i++) {
            min = i;
            //选择剩下的最下的元素的下标
            for (int j = min+1; j < len-1; j++) {
                //第一个已经作为排序的了
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            if(min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        return arr;
    }
}
