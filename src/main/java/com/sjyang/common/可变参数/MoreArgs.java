package com.sjyang.common.可变参数;

/**
 * @author saijun.yang
 * @date Created in 2019/9/16 16:45
 * @description 可变参数
 */
public class MoreArgs {
    public static void main(String[] args) {
        function(1,"A","B","C","D");
    }
    public static void function(int param1,String... args){
        System.out.println("输出可变参数："+args.length);
        for(String arg : args){
            System.out.println(arg);
        }
    }
}
