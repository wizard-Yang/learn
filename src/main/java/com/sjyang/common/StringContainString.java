package com.sjyang.common;

/**
 * @author ：saijun.yang
 * @date ：Created in 2019/4/1 15:05
 * @description：字符串是否包含另一个字符串
 * @modified By：
 * @version:
 */
public class StringContainString {
    public static void main(String[] args) {
        String str1 = "aaaa(temp)";
        String str2 = "(t1emp)";
        containOtherString(str1,str2);
    }
    public static void containOtherString(String str1,String str2){
        int result = str1.indexOf(str2);
        System.out.println(result);

    }
}
