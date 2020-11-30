package com.sjyang.collection.HashMap.keyset;

import java.util.HashMap;
import java.util.Map;

/**
 * @author saijun.yang
 * @date 2020/8/26 9:33
 * @description 通过keyset遍历
 */
public class ForEachKeySet {
    public static void main(String[] args) {
        String a=  "T+0";
        System.out.println(a.substring(2,3));
       /* Map<Integer,Source> map = new HashMap<>();
        Source source1 = new Source("属性1");
        Source source2 = new Source("属性2");
        map.put(4,source1);
        map.put(5,source2);
        for (int i = 0; i < map.size(); i++) {
            System.out.println(map.keySet().iterator().next());
        }*/
    }
}

class Source{
    private String attribute;
    public Source(String attribute){
        this.attribute = attribute;
    }
    public String getAttribute() {
        return attribute;
    }
}
