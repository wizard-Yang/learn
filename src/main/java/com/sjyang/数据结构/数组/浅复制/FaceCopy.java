package com.sjyang.数据结构.数组.浅复制;

/**
 * @author saijun.yang
 * @date Created in 2019/8/26 10:26
 * @description 浅复制
 * 可以将对象的值和对象的内容复制
 * 对于二维或者一维数组中存放的是对象时，
 * 复制结果是一维的引用变量传递给副本的一维数组，修改副本时，会影响原来的数组。
 * @modified By
 */
public class FaceCopy {
    public static void main(String[] args) {
        Pojo[] pojo = {new Pojo("小明",20),new Pojo("小张",21)};
        Pojo[] pojoCopy = new Pojo[pojo.length];
        System.arraycopy(pojo,0,pojoCopy,0,pojo.length);

        System.out.println("原数组");
        for (int i = 0; i < pojo.length; i++) {
            System.out.println(pojo[i].toString());
        }

        System.out.println("copy数组");
        for (int i = 0; i < pojoCopy.length; i++) {
            System.out.println(pojoCopy[i].toString());
        }
        System.out.println("源对象与目标对象的物理地址是否一样："+(pojo[0] == pojoCopy[0]?"浅复制":"深复制"));

        System.out.println("修改复制的数组------------------------------------");
        pojoCopy[0].setName("老奶奶");

        System.out.println("原数组");
        for (int i = 0; i < pojo.length; i++) {
            System.out.println(pojo[i].toString());
        }

        System.out.println("copy数组");
        for (int i = 0; i < pojoCopy.length; i++) {
            System.out.println(pojoCopy[i].toString());
        }
    }
}
class Pojo{
    String name;
    int age;
    public Pojo(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "{name:"+name+";age:"+age+"}";
    }

    public void setName(String name){
        this.name = name;
    }
}