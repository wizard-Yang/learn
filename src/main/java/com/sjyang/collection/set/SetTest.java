package com.sjyang.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author saijun.yang
 * @date 2020/1/13 14:47
 * @description set特性
 */
public class SetTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("a");
        set.add("b");
        set.add("a");
        set.add(null);
        System.out.println(set.size());
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
