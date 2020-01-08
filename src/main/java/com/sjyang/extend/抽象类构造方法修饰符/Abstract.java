package com.sjyang.extend.抽象类构造方法修饰符;

/**
 * @author saijun.yang
 * @date 2020/1/8 11:05
 * @description 使用public、protected、默认值修饰构造方法
 * 默认值同样只能本包进行使用
 */
public class Abstract {
    String name;
    int age;
    Abstract(){
        this.name = "sjyang";
        this.age = 25;
        System.out.println("name"+name+";age"+age);
    }
}
