package com.sjyang.finalUse;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author saijun.yang
 * @date Created in 2019/12/30 19:30
 * @description final修饰的成员需要给定初始值
 */
public class InitData {
    //final int i;不能编译通过
    int i;
    int j;
    long a = 0Xf000000000000000L;
    long b = 0x7FFFFFFFFFFFFFFFL;
    public void doSomething() {
        System.out.println(++j + i);
        Long ac = (a-b);
        System.out.println(Long.toBinaryString(ac));
    }
    public static void main(String[] args) {
        new InitData().doSomething();
    }
}
