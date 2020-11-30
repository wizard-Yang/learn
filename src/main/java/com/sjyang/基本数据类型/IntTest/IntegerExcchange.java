package com.sjyang.基本数据类型.IntTest;

/**
 * 自动装箱和自动拆箱
 * 缓存-127~128数字
 * 损失精度
 */
public class IntegerExcchange {
    public static void main(String[] args) {
        Integer i1 =200;
        Integer i2 =200;
        System.out.println("i1==i2: "+(i1==i2));
        Integer i3 =127;
        Integer i4 =127;
        System.out.println("i3==i4: "+(i3==i4));
        System.out.println( (3-0.6) == 0.4);
        //long可以转化为int吗
        long o = 100L;
        int a = (int)o;
        System.out.println(a);
    }
}
