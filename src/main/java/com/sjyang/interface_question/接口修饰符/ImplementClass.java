package com.sjyang.interface_question.接口修饰符;

/**
 * @author saijun.yang
 * @date 2020/1/8 10:35
 * @description 接口实现类验证信息
 */
public class ImplementClass implements Interface{
    public static void main(String[] args) {
        ImplementClass implementClass1 = new ImplementClass();
        System.out.println(implementClass1.attribute);
        implementClass1.fun3();
        Interface.fun4();
    }

    @Override
    public void func() {

    }
    @Override
    public void func2() {

    }
}

