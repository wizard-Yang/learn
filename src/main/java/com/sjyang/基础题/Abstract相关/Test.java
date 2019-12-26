package com.sjyang.基础题.Abstract相关;

/**
 * @author saijun.yang
 * @date Created in 2019/12/4 15:10
 * @description
 */
public abstract class Test {
    public int a = 0;
    private int b = 0;//abstract中可以有私有变量
    public static int c = 0;
    public void method(){
        function();
    }
    public static void function(){
        //System.out.println(a);static方法不可以使用非static属性
    }
}
