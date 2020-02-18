package com.sjyang.基本数据类型.byteTest;

/**
 * 类型自动转换
 */
public class TypeUp {
    public static void main(String[] args) {
        byte a1 = 3,a2 = 4,a3,a4;
        final byte a5 = 5,a6 = 6;
        a3 = a5+a6;
        //此处编译错误
        //a4 = a1+a2;
    }
}
