package com.sjyang.基本数据类型.floatTest;

/**
 * float定义必须以f或者F结尾
 */
public class DefineFloat {
    public static void main(String[] args) {
        //这个定义应为double转换丢失精度所以编译报错
        //float a = 1.1;
        float b = 3.3f;
        float c = 2F;
        float d = 5;
        Float e = 5.0f;
        System.out.println((e instanceof Float));
    }
}
