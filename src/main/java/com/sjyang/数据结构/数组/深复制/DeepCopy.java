package com.sjyang.数据结构.数组.深复制;

/**
 * @author saijun.yang
 * @date Created in 2019/8/26 10:56
 * @description 深复制
 * @modified By
 */
public class DeepCopy {
    public static void main(String[] args) {
        Pojo pojo = new Pojo("小明",100);
        Pojo pojoClone = (Pojo)pojo.clone();
        System.out.println("地址是否一致："+(pojo==pojoClone));
    }
}
class Pojo implements Cloneable{
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
    @Override
    public Object clone(){
        try {
            return  (Pojo)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
