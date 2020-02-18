package com.sjyang.基本数据类型.byteTest;

/**
 * byte超出范围加减法与自动转型
 * byte在进行运算时，会自动转换为Int进行，
 * a += 5考虑到最终是赋值给byte，因此应该是没有进行转换
 * 而最后一行进行了转换。
 */public class ByteTest {
    public static void main(String[] args) {
        byte a = 127;
        a += 5;
        System.out.println(a);
        byte b = 127;
        System.out.println(b+5);
    }
}
