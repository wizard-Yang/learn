package com.sjyang.collection.HashMap.创建HashMap传入一个Map;

import java.util.HashMap;

/**
 * @author saijun.yang
 * @date 2020/1/8 16:35
 * @description 构造方法传入一个Map集合
 */
public class CreateHashMap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>();
        for (int i = 0; i < 18; i++) {
            map.put(String.valueOf(i),String.valueOf(i));
        }
        HashMap<String,String> map2 = new HashMap<String,String>(map);
        System.out.println(map2.get("77").length());
    }
}
