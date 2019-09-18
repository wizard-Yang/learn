package com.sjyang.common;

/**
 * @author saijun.yang
 * @date Created in 2019/9/9 10:01
 * @description 是否会去除中间的空格
 * @modified By
 */
public class TrimTest {
    public static void main(String[] args) {
        String str = " aa cc bb  ";
        String str2 = "";
        System.out.println("字符:"+str.trim()+"完成");
        System.out.println("str2:"+str2.trim());
    }
}
