package com.sjyang.collection.list.集合遍历删除;

import java.util.ArrayList;
import java.util.List;

/**
 * @author saijun.yang
 * @date 2020/5/6 9:36
 * @description 通过--来进行遍历删除
 */
public class ListRemove2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        for (int i = list.size()-1; i >= 0; i--) {
            list.remove(i);
            list.remove(i);
        }
        for (Object o : list) {
            System.out.println(o.toString());
        }
    }
}
