package com.sjyang.基础题.静态内部类;

/**
 * @author saijun.yang
 * @date Created in 2019/8/30 10:51
 * @description
 * @modified By
 */
public class Test {
    public static void main(String[] args) {
        StaticInner staticInner = new StaticInner();
        staticInner.funcionOut();
        StaticInner.Inner.function();
    }
}
