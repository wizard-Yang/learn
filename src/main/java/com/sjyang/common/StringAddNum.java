package com.sjyang.common;

/**
 * @author saijun.yang
 * @date Created in 2019/8/7 13:54
 * @description
 * @modified By
 */
public class StringAddNum {
    public static void main(String[] args) {
        String str = "001";
        String newStr = String.valueOf(Integer.parseInt(str)+1);
        System.out.println(newStr);
    }
}
