package com.sjyang.排序;

/**
 * @author ：saijun.yang
 * @date ：Created in 2019/5/16 10:20
 * @description：归并排序
 * 时间复杂度：nlogn 适合大量数据排序
 *
 * @modified By：
 * @version:
 */
public class Guibing {
    public static void main(String[] args) {
        int[] arr = {3,5,6,1,2,9,4,7};
    }

    public static void guibing(int[] arr,int leftIndex,int rightIndex){
        //设置终止条件
        if(leftIndex == rightIndex){
            return;
        }
        //进行左右拆分比较
        int center = (leftIndex+rightIndex)/2;
        guibing(arr,leftIndex,center);
        guibing(arr,center+1,rightIndex);
        //进行合并
        for (int i = center; i >= leftIndex ; i--) {

        }

    }
}
