package com.sjyang.数字;

/**
 * @author saijun.yang
 * @date Created in 2019/6/5 15:22
 * @description 有趣的数字
 * @modified By
 */
public class MinMaxNum {
    public static void main(String[] args) {
        //判断数据缓存-127~128,IntegerCache
        Integer a = 50;
        Integer b = 50;
        Integer c = 150;
        Integer d = 150;
        System.out.println(a == b);
        System.out.println(c == d);

        //abs()取绝对值方法，取得的数一定都大于等于0吗？
        System.out.println(Math.abs(Integer.MIN_VALUE));//还是其本身

        //变形：是否存在 i+1 < i ?
        System.out.println((Integer.MAX_VALUE+1) < Integer.MAX_VALUE);

        //变形2：是否存在 i != 0  && i = -i
        System.out.println(Integer.MIN_VALUE == -Integer.MIN_VALUE);

        //是否存在i == i+1
        double dou = Double.POSITIVE_INFINITY;//无穷大
        System.out.println(dou == (dou+1));
        System.out.println(dou == (dou-100000));

        //是否存在i != i
        double douN = Double.NaN;
        System.out.println(douN != douN);


    }
}
