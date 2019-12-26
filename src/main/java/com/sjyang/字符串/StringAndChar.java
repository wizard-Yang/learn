package com.sjyang.字符串;

/**
 * @author saijun.yang
 * @date Created in 2019/12/26 14:08
 * @description 字符串和char
 */
public class StringAndChar {
    public static void main(String[] args) {
        String str = "hello world";
        str += 'a';
        str = str+100;
        System.out.println(str);
        StringAndChar t = null;
        t.B();
    }

    public void A(){
        this.B();
    }
    public static void B(){
        new StringAndChar().A();
    }
}
