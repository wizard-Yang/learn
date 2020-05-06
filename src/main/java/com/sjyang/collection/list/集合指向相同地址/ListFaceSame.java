package com.sjyang.collection.list.集合指向相同地址;

import java.util.ArrayList;
import java.util.List;

/**
 * @author saijun.yang
 * @date 2020/1/14 14:20
 * @description
 */
public class ListFaceSame {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        List<String> list2 = list;
        list2.add("C");

        List<String> list3 = new ArrayList<String>();
        list3.addAll(list);
        list3.add("ED");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
