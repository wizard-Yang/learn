package com.sjyang.extend.抽象类构造方法修饰符;

/**
 * @author saijun.yang
 * @date 2020/1/8 11:07
 * @description
 */
public class Test extends Abstract {
    public static void main(String[] args) {
        Test test = new Test();
    }
    public Test(){
        System.out.println("子类构造方法");
    }
}
