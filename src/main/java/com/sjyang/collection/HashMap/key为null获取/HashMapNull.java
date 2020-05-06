package com.sjyang.collection.HashMap.key为null获取;

import java.util.HashMap;

/**
 * @author saijun.yang
 * @date 2020/4/26 9:46
 * @description 获取值时，key为null
 */
public class HashMapNull {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        System.out.println(hashMap.get(null));
    }
}
