package com.sjyang.反射;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author saijun.yang
 * @date 2020/4/29 17:38
 * @description 反射
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        //获取类对象的三种方式：
        //1.通过类名
        Class<Person> cla = Person.class;
        System.out.println(cla);
        //2.通过对象获取
        Person p = new Person();
        Class<Person> cla2 = (Class<Person>) p.getClass();
        System.out.println(cla2);
        //3.通过类的全限定名
        Class cla3 = Class.forName("com.sjyang.反射.Person");
        System.out.println(cla3);
        Object object = cla.newInstance();
        //获取类中方法
        Class<String> claParam = (Class<String>) new String("aa").getClass();
        Method method = cla.getMethod("func3",new Class[] {Class.forName("java.lang.String")});
        method.invoke(object,new Class[] {claParam});
    }
}

class Person{
    String name = "saijun.yang";
    public void func1(){
        System.out.println("第一个方法");
    }
    private void func2(){
        System.out.println("第二个方法");
    }
    public void func3(String address){
        System.out.println(address);
    }
}