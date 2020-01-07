package com.sjyang.collection.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author saijun.yang
 * @date Created in 2019/12/30 13:10
 * @description 集合中的移除元素
 */
public class ListRemove {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("C");
        list.add("B");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("去重复");
        List<String> re = func(list);
        for (int i = 0; i < re.size(); i++) {
            System.out.println(re.get(i));
        }
    }

    public static List<String> func(List<String> list){
        List<String> result = new ArrayList<String>();
        result.addAll(list);
        Map<String,Object> map = new HashMap<String,Object>();
        for (int i = 0; i < list.size(); i++) {
            if(map.containsKey(list.get(i))){
                for (int j = 0; j < result.size(); j++) {
                    if(list.get(i).equals(result.get(j))){
                        result.remove(j);
                        j--;
                    }
                }
            }else{
                map.put(list.get(i),null);
            }
        }
        return result;
    }
}
