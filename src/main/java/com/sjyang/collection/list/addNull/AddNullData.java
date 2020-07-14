package com.sjyang.collection.list.addNull;

import java.util.*;

/**
 * @author saijun.yang
 * @date 2020/7/8 13:59
 * @description list集合是否可以添加null数据
 */
public class AddNullData {
    public static void main(String[] args) {
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        if(list == null){
           list = Collections.emptyList();
        }
        List<Map<String,Object>> list2 = null;//new ArrayList<Map<String,Object>>();
        //Map<String,Object> map = new HashMap<>();
        //map.put("a","a");
        //list2.add(map);
        list.addAll(list2);
    }
}
