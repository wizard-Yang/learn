package com.sjyang.字符串;

import java.util.ArrayList;
import java.util.List;

/**
 * @author saijun.yang
 * @date Created in 2019/11/1 11:43
 * @description 截取字符串
 */
public class SubStringStr {
    public static void main(String[] args) {
        /*String str= "abcdefghij";
        System.out.println(str.substring(str.length()-5,str.length()));*/

        List list  = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        List list1 = new ArrayList();
        list1.addAll(list);
        list1.remove(1);
        for (int i = list.size()-1; i >= 0 ; i--) {
            System.out.println(list.get(i));
        }

    }
}
