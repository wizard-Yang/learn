package com.sjyang.extend.子类与父类构造方法;

/**
 * @author saijun.yang
 * @date Created in 2019/12/27 11:17
 * @description 子类默认调用父类构造方法，如父类没有无参数构造方法，
 * 需要在子类构造方法第一行显示的调用父类构造方法
 */
public class Construction{
    public static void main(String[] args) {
        Son son = new Son();
        Son son1 = null;
        /**
         * 可以通过对象调用类中的静态方法
         */
        son1.func();//这样也是可以调用成功的
        //Son.func();
    }
}

class Parent{
    /*public Parent(){
        System.out.println("我是父类无参构造方法");
    }*/

    public Parent(String str){
        System.out.println("我是父类有参构造方法"+str);
    }
}

class Son extends Parent{
    Son(){
        //这里默认调用了父类的无参数构造方法
        super("haha");
        System.out.println("我是子类构造方法");
    }
    public void method(){
        System.out.println("对象实例方法");
    }

    /**
     * 静态方法不可以调用实例方法，但是可以通过创建类对象调用
     */
    public static void func(){
        Son son = new Son();
        son.method();
        System.out.println("静态方法");
    }
}
