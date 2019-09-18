package com.sjyang.common;

/**
 * @author ：saijun.yang
 * @date ：Created in 2019/5/14 11:29
 * @description：关于null对String的影响
 * @modified By：
 * @version:
 */
public class StringNull {
    public static void main(String[] args) {
        ((StringNull)null).say("null的强转");
        ((StringNull)null).sayAgain();//Exception in thread "main" java.lang.NullPointerException
        new StringNull().sayAgain();
        //null可以强转为任意的对象类型
    }

    //属于类调用的static方法
    public static void say(String param){
        System.out.println("say:"+param);
    }
    //属于对象的方法调用
    public void sayAgain(){
        System.out.println("null可不行");
    }

}
