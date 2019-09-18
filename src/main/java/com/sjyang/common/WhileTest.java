package com.sjyang.common;

/**
 * @author saijun.yang
 * @date Created in 2019/9/3 19:47
 * @description
 * @modified By
 */
public class WhileTest {
    public static void main(String[] args) {
        int num = 5;
        int increse = 1;
        while(num-- > 0){
            System.out.println(increse++);
        }
        System.out.println(num);
    }
}
