package com.sjyang.jvm.类加载.被动引用;

/**
 * @author saijun.yang
 * @date 2020/4/23 16:24
 * @description 被动引用1-通过子类引用父类的静态字段，子类不会被初始化
        */
public class beidong1 {
    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }
}

class SuperClass{
    static{
        System.out.println("SuperClass初始化");
    }
    public static final String value = "superField";
}

class SubClass extends SuperClass{
    static{
        System.out.println("SubClass初始化");
    }
}
