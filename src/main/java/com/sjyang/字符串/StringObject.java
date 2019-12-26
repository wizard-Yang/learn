package com.sjyang.字符串;

/**
 * @author saijun.yang
 * @date Created in 2019/12/26 19:12
 * @description 字符串创建时对象的关系
 */
public class StringObject {
    public static void main(String[] args) {
        pinjieObject();
    }
    //两个直接赋值的字符串比较
    public static void xiangdeng(){
        String a = "abc";
        String b = "abc";
        System.out.println(a == b);
    }
    //newString创建了几个对象
    public static void newObkect(){
        String a = "abc";
        String b = new String("abc");
        System.out.println(a == b);
    }

    //拼接字符串比较
    public static void pinjie(){
        String b = "abc";
        String a = "a"+"b"+"c";
        System.out.println(a == b);
    }
    //拼接字符串比较(不直接不符拼接)
    public static void pinjieObject(){
        String a = "ab";
        String b = "abc";
        String c = a + "c";
        System.out.println(c == b);
    }
}
