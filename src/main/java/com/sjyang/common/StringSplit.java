package com.sjyang.common;

/**
 * @author ：saijun.yang
 * @date ：Created in 2019/5/8 16:36
 * @description：字符串截取
 * @modified By：
 * @version:
 */
public class StringSplit {
    public static void main(String[] args) {
        String test = "abc,";
        String test1 = "767868,";
        String[] arr = test1.split(",");
        System.out.println(arr.length);
        System.out.println(test1.indexOf(","));
        System.out.println(test1.substring(test1.indexOf(",")+1,test1.length()));
    }
}
