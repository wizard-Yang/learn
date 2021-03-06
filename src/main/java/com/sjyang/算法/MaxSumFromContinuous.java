package com.sjyang.算法;

/**
 * @author ：saijun.yang
 * @date ：Created in 2019/5/9 9:03
 * @description：最大子序列求和
 * 最大子数列问题的目标是在数列的一维方向找到一个连续的子数列，使该子数列的和最大。
 * 例如，对一个数列 −2, 1, −3, 4, −1, 2, 1, −5, 4，其连续子数列中和最大的是 4, −1, 2, 1, 其和为6。
 * 这里会通过对时间复杂度进行比较，列出四种算法
 * @modified By：saijun.yang
 * @version:
 */
public class MaxSumFromContinuous {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5};
        System.out.println(divideAndConque(arr,0,7));
        System.out.println(maxSubSum3(arr,0,7));
    }

    /**
     * 穷举法
     * 时间复杂度T(n) = O(n^3)
     * @param arr
     */
    public static void method1(int[] arr){
        int maxsum = 0;
        int sum;
        int len = arr.length;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                sum = 0;
                for (int k = i; k < j; k++) {
                    sum += arr[k];
                }
                if(sum > maxsum){
                    sb.setLength(0);
                    for (int x = i; x < j; x++) {
                        sb.append(arr[x]+",");
                    }
                    maxsum = sum;
                }
            }
        }
        System.out.println("最大值为："+maxsum);
        System.out.println("最大序列为："+sb.toString());
    }

    /**
     * 对穷举法进行改进
     * 时间复杂度：T(n) = O(n^2)
     * 改进方向：进行a[i]至a[j]这一串数字进行相加时
     *          第三次循环每次都进行了重复的相加，因为在前一次已经是a[i]~a[j-1]的和了
     *          所以没必要在第三次进行重复的从头开始相加了。
     * @param arr
     */
    public static void method2(int[] arr){
        int maxsum = 0;
        int sum;
        int len = arr.length;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < len; i++) {
            sum = 0;
            for (int j = i; j < len; j++) {
                sum+=arr[j];
                if(sum > maxsum){
                    sb.setLength(0);
                    for (int x = i; x <= j; x++) {
                        sb.append(arr[x]+",");
                    }
                    maxsum = sum;
                }
            }
        }
        System.out.println("最大值为："+maxsum);
        System.out.println("最大序列为："+sb.toString());
    }

    /**
     * 分治（分而治之）
     * @param a 处理数组
     * @param left 左边界0
     * @param right 右边界7
     * 共8个数字，9个单数的时候其实是一样的
     * @return
     */
    public static int maxSubSum3(int[] a, int left, int right) {
        if (left == right) {
            if (a[left] > 0) {
                return a[left];
            } else {
                return 0;
            }
        }
        int center = (left + right) / 2;
        int maxLeftSum = maxSubSum3(a, left, center);
        int maxRightSum = maxSubSum3(a, center + 1, right);

        int maxLeftBorderSum = 0, leftBorderSum = 0;
        for (int i = center; i >= left; i--) {
            leftBorderSum += a[i];
            if (leftBorderSum > maxLeftBorderSum) {
                maxLeftBorderSum = leftBorderSum;
            }
        }
        int maxRightBorderSum = 0, rightBorderSum = 0;
        for (int i = center + 1; i <= right; i++) {
            rightBorderSum += a[i];
            if (rightBorderSum > maxRightBorderSum) {
                maxRightBorderSum = rightBorderSum;
            }
        }
        int maxBorderSum = maxLeftBorderSum + maxRightBorderSum;
        return maxBorderSum > maxLeftSum ? (maxBorderSum > maxRightSum ? maxBorderSum : maxRightSum)
                : (maxLeftSum > maxRightSum ? maxLeftSum : maxRightSum);
    }

    /**
     * 算法思想：设a[i]为和最大序列的起点，则如果a[i]是负的，那么它不可能代表最优序列的起点，因为任何包含a[i]作为起点的子序列都可以通过a[i+1]作起点而得到改进。
     * 类似的，任何负的子序列也不可能是最优子序列的前缀。
     * 核心思想就是：这段序列头部肯定是正数，如果相邻相加还是负数，那就可以舍弃了。
     */

    public static int maxSubSum4(int[] a){
        int maxSum=0,sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(sum>maxSum){
                maxSum=sum;
            }else if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }

    //分治算法-读不懂，背下来
    public static int divideAndConque(int[] arr,int left,int right){
        //递归终止的条件-当分组到最终的单个元素时
        if(left == right){
            if(left > 0){
                return arr[left];
            }else{
                return 0;
            }
        }
        int center = (left+right)/2;//求分界点
        //进行分组时，求左边分组最大值
        int leftMax = divideAndConque(arr,left,center);

        //进行分组时，求右边分组最大值
        int rightMax = divideAndConque(arr,center+1,right);

        //进行边界最大值和
        int maxBorderSum = 0;
        //左边界最大值和
        int leftBorderMaxSum = 0;
        int leftBorderSum = 0;
        for (int i = center; i >= left ; i--) {
            leftBorderSum += arr[i];
            if(leftBorderSum > leftBorderMaxSum){
                leftBorderMaxSum = leftBorderSum;
            }
        }

        //右边界最大和求值
        int rightBorderMaxSum = 0;
        int rightBorderSum = 0;
        for (int i = center+1; i <= right; i++) {
            rightBorderSum += arr[i];
            if(rightBorderSum > rightBorderMaxSum){
                rightBorderMaxSum = rightBorderSum;
            }
        }
        maxBorderSum = leftBorderMaxSum + rightBorderMaxSum;
        return maxBorderSum>leftMax?(maxBorderSum > rightMax? maxBorderSum:rightMax):(leftMax > rightMax? leftMax:rightMax);

    }

}
