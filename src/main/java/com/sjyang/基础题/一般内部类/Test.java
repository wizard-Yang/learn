package com.sjyang.基础题.一般内部类;

/**
 * @author saijun.yang
 * @date Created in 2019/8/27 20:15
 * @description 一般内部类问题1
 * @modified By
 */
public class Test {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}
