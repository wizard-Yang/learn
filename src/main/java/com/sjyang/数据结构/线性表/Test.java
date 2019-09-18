package com.sjyang.数据结构.线性表;

import java.util.*;

/**
 * @author saijun.yang
 * @date Created in 2019/8/13 10:00
 * @description
 * @modified By
 */
public class Test {
    public static void main(String[] args) {
        Collections.synchronizedList(new ArrayList<>());
        List list = new Vector();
        System.out.println(Integer.MAX_VALUE);

        /*ArrayListSimple<String> arrayListSimple = new ArrayListSimple<String>();
        arrayListSimple.add("0");
        arrayListSimple.add("1");
        arrayListSimple.add("2");
        arrayListSimple.add("3");
        arrayListSimple.delete("1");
        System.out.println("长度："+arrayListSimple.size());
        System.out.println("打印数组");
        for (int i = 0; i < arrayListSimple.size(); i++) {
            System.out.println(arrayListSimple.get(i));

        }*/

        //List list = new ArrayList();
        /*list.add(1);
        list.add(2);
        list.add(3);
        list.add(0,4);*/

        //list.add(1);
        Demo demo1 = new Demo(1,"张三");
        Demo demo4 = new Demo(1,"张三");
        Demo demo2 = new Demo(2,"李四");
        Demo demo3 = new Demo(3,"王二");
        list.add(demo1);
        list.add(demo2);
        list.add(demo3);
        System.out.println(list.get(0).equals(demo4));
        System.out.println(list.get(8));
        //list.add(4,demo3);
        //list.remove(demo1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}

class Demo{
    int age;
    String name;
    public Demo(int age,String name){
        this.age = age;
        this.name = name;
    }
    public String toString(){
        return "姓名"+name+";年龄："+age;
    }
}
