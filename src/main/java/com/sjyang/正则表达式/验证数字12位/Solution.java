package com.sjyang.正则表达式.验证数字12位;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author saijun.yang
 * @date 2020/7/31 13:18
 * @description 验证给点的字符串必须为12位数字
 */
public class Solution {
    public static void main(String[] args) {
        String reg = "^\\d{5}$";
        String str = "00010";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.find());
    }
}
