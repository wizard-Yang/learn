package com.sjyang.算法.两数求和数组中取数;

import java.util.HashMap;
import java.util.Map;

/**
 * @author saijun.yang
 * @date Created in 2019/7/23 17:45
 * @description 给定一个整数数组 nums 和一个目标值 target，
 * 请你在该数组中找出和为目标值的那 两个整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 示例:（注意数组不是有序的）
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 暴力法的时间复杂度：T(n) = n^2
 * 二次哈希法时间复杂度: T(n)=n
 */
public class Test {
    public static void main(String[] args) {
        int arrInt[] = {5,8,9,11,14,16,22};
        int target = 30;
        test(arrInt,target);
    }
    private static void test(int[] arrInt,int target){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < arrInt.length; i++) {
            map.put(arrInt[i],i);
        }
        for (int i = 0; i < arrInt.length; i++) {
            int compare = target-arrInt[i];
            if(map.containsKey(compare) && (map.get(compare) != i)){
                System.out.println("和为目标值的两个值为:"+arrInt[i]+"和"+compare);
                System.out.println("下标值为:"+i+"和"+map.get(compare));
            }
        }
    }
}
