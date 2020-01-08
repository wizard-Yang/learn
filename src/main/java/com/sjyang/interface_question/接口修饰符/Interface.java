package com.sjyang.interface_question.接口修饰符;

/**
 * 接口修饰符只能是public,不写默认也是public
 */
abstract interface Interface {
    /**
     * 默认属性修饰符public static final
     * 仅使用默认值，其他不行
     */
    public static final String attribute = "I am Attribute";
    String str = "aa";
    /**
     * 默认方法修饰符public abstract
     * 仅使用默认值
     */
    public abstract void func();
    void func2();
    /**
     * jdk1.8接口中可以有具体实现方法，使用default修饰
     * 默认方法实现
     */
    default void fun3(){
        System.out.println("aa");
    }
    /**
     * 静态修饰
     */
    static void fun4(){
        System.out.println("我是接口中的静态默认实现");
    }
}
