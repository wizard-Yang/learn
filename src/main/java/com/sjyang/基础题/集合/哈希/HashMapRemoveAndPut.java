package com.sjyang.基础题.集合.哈希;

import java.util.HashMap;
import java.util.Map;

/**
 * @author saijun.yang
 * @date Created in 2019/10/14 11:19
 * @description 集合的移除元素和添加
 */
public class HashMapRemoveAndPut {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("A","a");
        map.put("B","b");
        map.remove("A");
        map.put("D","d");
    }
}
