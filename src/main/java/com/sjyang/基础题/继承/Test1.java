package com.sjyang.基础题.继承;

import java.util.ArrayList;

/**
 * @author saijun.yang
 * @date Created in 2019/9/25 8:54
 * @description
 */
public class Test1 extends AbstractUse implements Cloneable{
    public String name = "sjyang";
    public static void main(String[] args) {
        Test1 t = new Test1();
        Test1 clone = t.function();
        System.out.println(clone.name);
    }
    public Test1 function(){
        return (Test1)clone();
    }
}
