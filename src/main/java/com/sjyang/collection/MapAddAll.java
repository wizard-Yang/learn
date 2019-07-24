package com.sjyang.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author saijun.yang
 * @date Created in 2019/6/28 11:08
 * @description map集合添加集合
 * @modified By
 */
public class MapAddAll {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("a","a");
        map.put("b","b");
        Map<String,String> map2 = new HashMap<String,String>();
        map2.put("c","c");
        map2.put("b","e");
        map.putAll(map2);
        Set set = map.keySet();
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(map.get(it.next().toString()));
        }
    }
}
