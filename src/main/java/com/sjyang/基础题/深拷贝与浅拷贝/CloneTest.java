package com.sjyang.基础题.深拷贝与浅拷贝;

/**
 * @author saijun.yang
 * @date Created in 2019/9/11 14:48
 * @description
 * @modified By
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("sjyang",25);
        Person p2 = p1.getClonePerson();
        System.out.println(p1);
        System.out.println(p2);
    }

}
class Person implements Cloneable{
    String name;
    int age;
    public Person(String name,int age){
        this.name = name;
        this.age =age;
    }
    public Person getClonePerson() throws CloneNotSupportedException {
        return (Person)this.clone();
    }

    /*@Override
    public Person clone() throws CloneNotSupportedException {
        return (Person)super.clone();
    }*/
}
