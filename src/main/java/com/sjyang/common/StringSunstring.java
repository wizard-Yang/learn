package com.sjyang.common;

/**
 * @author saijun.yang
 * @date Created in 2019/8/1 20:08
 * @description 字符串截取
 * @modified By
 */
public class StringSunstring {
    public static void main(String[] args) {
        String str = "000010762";
        System.out.println(substring(str,-3));
    }
    public static String substring(String str, int start) {
        if (str == null) {
            return null;
        } else {
            if (start < 0) {
                start += str.length();
            }

            if (start < 0) {
                start = 0;
            }

            return start > str.length() ? "" : str.substring(start);
        }
    }
}
