package com.sjyang.集合.Set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author saijun.yang
 * @date 2021/7/22 16:42
 * @description
 */
public class MyHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        String str = "票据5";
        set.add(str);
        System.out.println(set.contains(str));
    }
}
