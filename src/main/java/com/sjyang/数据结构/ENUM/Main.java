package com.sjyang.数据结构.ENUM;

import static com.sjyang.数据结构.ENUM.Color.BLACK;
import static com.sjyang.数据结构.ENUM.Color.BLUE;
import static com.sjyang.数据结构.ENUM.Color.RED;

/**
 * @author saijun.yang
 * @date 2020/11/30 16:23
 * @description
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("1.枚举当作常量使用");
        Color[] arr = Color.values();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(RED);

        System.out.println("2.作为switch条件");
        Color color = RED;
        switch(color){
            case RED:
                color = RED;
                break;
            case BLACK:
                color = BLACK;
                break;
            case BLUE:
                color = BLUE;
                break;
        }
        System.out.println(color);

        System.out.println("3.向枚举中添加新的方法");
        //System.out.println(Color1.getName(1));
        System.out.println(Color1.getIndexFunc("红色"));

       /* System.out.println("简单赋值");
        Color2[] color2s = Color2.values();
        for (int i = 0; i < color2s.length; i++) {
            System.out.println(color2s[i]);
        }*/

    }
}
