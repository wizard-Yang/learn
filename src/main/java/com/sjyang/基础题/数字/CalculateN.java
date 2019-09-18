package com.sjyang.基础题.数字;

/**
 * @author saijun.yang
 * @date Created in 2019/8/13 11:37
 * @description
 * @modified By
 */
public class CalculateN {
    public static void main(String[] args) {
        for (int i = 0; i < 1500; i++) {
            if((i & 2) == 2){
                System.out.println(i);
            }
        }

    }
}
