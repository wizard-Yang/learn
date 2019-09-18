package com.sjyang.基础题.内部类引用外部类属性;

/**
 * @author saijun.yang
 * @date Created in 2019/8/27 20:06
 * @description 为什么内部类引用外部类属性需要加final修饰
 * 前提：局部内部类
 * 解决：局部变量生命周期与局部内部类生命周期不一致问题
 * @modified By
 */
public class Test {
    public static void main(String[] args) {
        PartInnerClass partInnerClass = new PartInnerClass();
        partInnerClass.function("hehe").functionInner();
        //System.out.println(partInnerClass.str);

    }
}
