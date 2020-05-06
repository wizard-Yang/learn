package com.sjyang.字符串.null值转换;

/**
 * @author saijun.yang
 * @date 2020/2/4 14:43
 * @description 字符串转空值
 */
public class NullToValue {
    public static void main(String[] args) {
        String a = null;
        String b = String.valueOf(a);
        System.out.println(b);
    }
}
