package com.sjyang.集合.List集合;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 集合的排序
 */
public class ListSort {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(5);
        list.add(4);
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("排序之后");
        Collections.sort(list);
        for (Object o : list) {
            System.out.println(o);
        }

        //自定义对象
        Person p = new Person("杨赛军",24);
        Person p1 = new Person("张婷婷",23);
        Person p2 = new Person("宋秀华",55);
        List pList = new ArrayList();
        pList.add(p);
        pList.add(p1);
        pList.add(p2);
        List pListCopy = new ArrayList(pList);
        Collections.sort(pList);
        for (Object o : pList) {
            System.out.println( o.toString());
        }
        Collections.sort(pList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        for (Object o : pList) {
            System.out.println(o.toString());
        }
    }
}

class Person implements Comparable<Person>{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 0代表相等
     * 正数大于
     * 负数小于
     * @param o
     * @return
     */
    @Override
    public int compareTo(Person o) {
        int r = this.getAge() - o.getAge();
        return r;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
