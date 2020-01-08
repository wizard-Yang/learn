package com.sjyang.collection.HashMap.测试容量最大值;

import java.util.HashMap;
import java.util.Map;

/**
 * @author saijun.yang
 * @date 2020/1/8 14:22
 * @description:最大容量是1<<30即2^30,跑满了会如何
 */
public class MaxCapacity {
    public static void main(String[] args) {
        Map<Object,Object> map = new HashMap<Object,Object>(1000000);
        Integer i = Integer.MIN_VALUE;
        long start = System.currentTimeMillis();
        while(i < Integer.MAX_VALUE){
            System.out.println("执行中...{"+i+"}");
            map.put(i,i);
            i++;
        }
        long end = System.currentTimeMillis();
        System.out.println("用时："+(end-start));
        System.out.println("容量："+map.size());
    }
}
