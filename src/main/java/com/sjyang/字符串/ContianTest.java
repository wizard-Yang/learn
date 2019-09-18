package com.sjyang.字符串;

/**
 * @author saijun.yang
 * @date Created in 2019/8/14 10:45
 * @description 字符串包含另一个字符串，有特殊字符
 * @modified By
 */
public class ContianTest {
    public static void main(String[] args) {
        String str1 = "sjyang9999003(temp)";
        String str2 = "(temp)";
        System.out.println(str1.contains(str2));
    }
}
