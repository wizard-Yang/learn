package com.sjyang.collection.HashMap;
import java.util.*;


/**
 * @author saijun.yang
 * @date 2020/1/8 11:36
 * @description
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Person> map1 = new HashMap<String,Person>();
        Person person = new Person("sjyang",15);
        Person person2 = new Person("sjyang",15);
        map1.put("person1",person);
        System.out.println(map1.containsValue(person2));
    }
}
class Person{
    private String name;
    private int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person){
            Person p = (Person)obj;
            return (name.equals(p.name) && age == p.age);
        }else{
            return false;
        }
    }
}
