package com.sjyang.基础题.一般内部类;

/**
 * @author saijun.yang
 * @date Created in 2019/8/27 20:16
 * @description 要求使用已知的变量，在三个输出方法中填入合适的代码，在控制台输出30，20，10。
 * 就是在3个system括号里面添值
 * @modified By
 */
public class Outer {
    public int num = 10;
    public static String str = "out";
    class Inner{
        public int num = 20;
        public void show(){
            int num = 30;
            //填入合适的代码
            System.out.println(Outer.this.num);
            System.out.println(this.num);
            System.out.println(num);
            System.out.println(str);
        }
    }
}
