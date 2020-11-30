package com.sjyang.集合.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author saijun.yang
 * @date 2020/10/20 18:50
 * @description
 */
public class HashMapLearn {
    public static void main(String[] args) {
        int h;
        System.out.println((h = "a".hashCode()) ^ (h >>> 16));
        /*HashMap map = new HashMap();
        map.put("a","a");
        function1();*/
    }

    /**
     * 测试修改次数modCount,使用迭代器遍历集合，删除元素，查看是否失败
     */
    public static void function1(){
        Map<String,String> map = new HashMap<String,String>();
        map.put("a","a");
        map.put("b","b");
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            map.remove("a");
        }
    }
}

class MyHashMap extends HashMap{

}