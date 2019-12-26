package com.sjyang.字符串;

/**
 * @author saijun.yang
 * @date Created in 2019/8/14 10:45
 * @description 字符串包含另一个字符串，有特殊字符
 * @modified By
 */
public class ContianTest {
    public static void main(String[] args) {
       /* String str1 = "sjyang9999003(temp)";
        String str2 = "(temp)";
        System.out.println(str1.contains(str2));*/
       //double a = 1.0;
        String s = null;
        System.out.println("a".equals(s));
        //System.out.println(String.valueOf(a));
        System.out.println("c,a,d,v".indexOf(",a,"));
        System.out.println(IndexOf("a","c,a,d,v,b",","));

    }
    public static Boolean IndexOf(String str1,String str2,String splitChar){
        String temp1,temp2;
        temp1 = String.format("%s%s%s",splitChar,str1,splitChar);
        temp2 = String.format("%s%s%s",splitChar,str2,splitChar);
        if(temp1.indexOf(temp2) >= 0) return true;
        return false;
    }
}
