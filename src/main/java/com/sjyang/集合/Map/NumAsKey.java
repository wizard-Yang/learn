package com.sjyang.集合.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author saijun.yang
 * @date 2020/11/6 14:45
 * @description
 */
public class NumAsKey {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        map.put("4","4");
        map.put("5","5");
        map.put("6","6");
        System.out.println(map.get("4"));
    }
}
