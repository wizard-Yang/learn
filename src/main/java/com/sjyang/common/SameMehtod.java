package com.sjyang.common;

/**
 * @author saijun.yang
 * @date Created in 2019/6/5 15:20
 * @description 同名返回值不同,语句不合法，直接编译不通过
 * @modified By
 */
public class SameMehtod {
    public static void main(String[] args) {

    }
    public static String  method(){
        return "string";
    }
    /*public static int method(){
        return 2;
    }*/
}
