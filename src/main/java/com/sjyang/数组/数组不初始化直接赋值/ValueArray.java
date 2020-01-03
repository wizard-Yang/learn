package com.sjyang.数组.数组不初始化直接赋值;

/**
 * @author saijun.yang
 * @date Created in 2020/1/3 8:48
 * @description 数组直接赋值
 */
public class ValueArray {
    public static void main(String[] args) {
        int a[] = null;
        a[0] = 1;//java.lang.NullPointerException
        System.out.println(a.length);
    }
}
