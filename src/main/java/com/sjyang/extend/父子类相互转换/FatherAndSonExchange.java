package com.sjyang.extend.父子类相互转换;

/**
 * @author saijun.yang
 * @date 2020/3/26 15:25
 * @description 子类可以转换为父类，父类不可以转化为子类
 */
public class FatherAndSonExchange {
    public static void main(String[] args) {
        Son1 son1 = new Son1();
        Father father = (Father)son1;
        System.out.println(father.name);
        //Son2 son2 = (Son2)();
        //System.out.println(son2.name);
    }
}
class Father{
    public String name;
}
class Son1 extends Father{
    public int age;
    Son1(){
        this.age = 1;
        this.name = "son1";
    }
}
class Son2 extends Father{
    public String add;
}
