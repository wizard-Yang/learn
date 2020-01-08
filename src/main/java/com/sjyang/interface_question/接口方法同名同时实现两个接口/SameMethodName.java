package com.sjyang.interface_question.接口方法同名同时实现两个接口;

/**
 * @author ：saijun.yang
 * @date ：Created in 2019/5/10 11:41
 * @description：两个接口方法同名，实现这两个接口
 * @modified By：
 * @version:
 */
public class SameMethodName implements Interface1,Interface2{
    public static void main(String[] args) {
        SameMethodName sameMethodName = new SameMethodName();
        sameMethodName.method1();
    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}
