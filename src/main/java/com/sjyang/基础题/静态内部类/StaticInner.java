package com.sjyang.基础题.静态内部类;

/**
 * @author saijun.yang
 * @date Created in 2019/8/30 10:47
 * @description 静态内部类
 * 可以实现单利模式
 * @modified By
 */
public class StaticInner {
    public String name = "sjyang";
    public static String smallName = "xiaoxiao";
    public final String otherName = "niuniu";
    private String moreName = "dajun";
    public void funcionOut(){
        System.out.println(name);
        System.out.println(smallName);
        System.out.println(otherName);
        System.out.println(moreName);
    }
    public static class Inner{
        public static void function(){
            //System.out.println(name);//无法使用
            System.out.println(smallName);
            //System.out.println(otherName);//无法使用
            //System.out.println(moreName);//无法使用
        }
    }
}
