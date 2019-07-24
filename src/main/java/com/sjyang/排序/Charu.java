package com.sjyang.排序;

/**
 * @author ：saijun.yang
 * @date ：Created in 2019/5/16 8:58
 * @description：插入排序
 * 核心思想：选定第一个元素作为已排序数组
 *          一次获取后面元素与已排序数据比较，并选择合适位置插入
 *          重要思想是先比较，然后插入
 * 还有一个需要注意的是，每次比较因为前面的已经是排序好的，所以从最后开始比较
 * 插入排序思想是所有进行比较完成后，最后进行插入，因此是需要一个不变的变量进行最后的插入操作。
 * @modified By：
 * @version:
 */
public class Charu {
    public static void main(String[] args) {
        int arr[] = {3,4,8,2,1,7,10,5};
        arr = charu(arr);
        for (int ele:arr){
            System.out.print(ele+",");
        }
    }

    public static int[] charu(int[] arr){
        int len = arr.length;
        //第一个数默认作为放在已排序的数组中，故i从1开始
        for (int i = 1; i < len; i++) {
            int ele = arr[i];
            /**
             * 此时应该是假设两个数组，其中一个数组有一个元素arr[0]
             * 而要与其比较的元素值为arr[1],只需比较1次
             * 同样的，当比较完成后，已排序的数组里面就有2个元素
             * 此时i=2时，arr[2]就需要进行两次比较，即与arr[0],arr[1]比较
             * 由此发现规律，每次比较的次数为i-1，当全部比较完成后，就可以将其
             * 插入到指定位置，故如下进行比较
             */
            int j = i-1;
            for ( ;j >= 0 ; j--) {
                //开始比较
                if(arr[j] > ele){
                    /**
                     * 如果后面的大于前面的，将大的移动到后面，这里重要的时此时小的没有进行交换
                     * 而是继续进行下一轮比较，直到不小于前面的数，这时候推出循环，在最下方进行
                     * 插入，因为ele元素一直未变
                     */
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = ele;

        }
        return arr;
    }

    public static int[] pra(int[] arr){
        int len = arr.length;
        //第一个元素放在了已排序数组
        for (int i = 1; i < len ; i++) {
            int sortEle = arr[i];
            //根据规律，每次只需要比较i次（因为i=1时，排序数组放了arr[0],一个元素）
            int j = i-1;
            for (; j >= 0 ; j--) {//不要小瞧这个--，在最后会将数据替换的
                if(sortEle < arr[j]){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = sortEle;
        }
        return arr;
    }

}
