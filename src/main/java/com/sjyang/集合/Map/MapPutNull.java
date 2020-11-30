package com.sjyang.集合.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author saijun.yang
 * @date 2020/11/9 16:59
 * @description
 */
public class MapPutNull {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put(null,"a");
        map.put(null,"b");
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry.getKey());
            System.out.println(stringStringEntry.getValue());
        }
    }
}
