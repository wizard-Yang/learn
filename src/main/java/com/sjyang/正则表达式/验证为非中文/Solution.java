package com.sjyang.正则表达式.验证为非中文;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author saijun.yang
 * @date 2020/7/31 13:18
 * @description 验证给点的字符串必须为12位数字
 */
public class Solution {
    public static void main(String[] args) {
        String pattern = "[\\u4e00-\\u9fa5]";
        String content = "a,sd,，奤";
        Pattern p = Pattern.compile("[\u4e00-\u9fa5]");
        Matcher m = p.matcher(content);
        if (m.find()) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }

       /* String str = "00010";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.find());*/
    }
}
