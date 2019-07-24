package com.sjyang.common;

/**
 * @author ：saijun.yang
 * @date ：Created in 2019/5/15 17:48
 * @description：字符串和char的链接
 * @modified By：
 * @version:
 */
public class StringAndChar {
    /**
     * 结果
     * 97
     * 100hello
     * helloa3
     * 10cc
     * cc83
     * 65535
     * @param args
     */
    public static void main(String[] args) {
        String str1 = 'a'+3+"hello";
        String str2 = "hello"+'a'+3;
        String str3 = 6+4+"cc";
        String str4 = "cc"+8+3;
        System.out.println((int)'a');
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println((int)(char)(byte)-1);
    }
}
