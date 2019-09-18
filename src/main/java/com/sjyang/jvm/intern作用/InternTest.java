package com.sjyang.jvm.intern作用;

/**
 * @author saijun.yang
 * @date Created in 2019/9/10 10:52
 * @description
 * @modified By
 */
public class InternTest {
    public static void main(String[] args) {

        String str2 = new String("ab");
        str2.intern();
        String str1 = "ab";
        System.out.println(str1 == str2);
        System.out.println(str1 == str2.intern());
    }
}
