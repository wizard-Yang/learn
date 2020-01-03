package com.sjyang.extend.重写规则;

/**
 * @author saijun.yang
 * @date Created in 2019/12/30 18:49
 * @description 两同两小一大原则， 方法名相同，参数类型相同，子类返回类型小于等于父类方法返回类型，
 * 子类抛出异常小于等于父类方法抛出异常， 子类访问权限大于等于父类方法访问权限。［注意：这里的返回类型必须要在有继承关系的前提下比较］
 */
public class ReWrite {
    void func2(){

    }
}

class Super{
    protected Object func(String name,int age){
        return new Object();
    }
}

class Base extends Super{
    @Override
    public Object func(String name, int age) {
        return null;
    }
}
