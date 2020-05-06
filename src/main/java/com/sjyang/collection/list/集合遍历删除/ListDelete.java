package com.sjyang.collection.list.集合遍历删除;

import java.util.ArrayList;
import java.util.List;

/**
 * @author saijun.yang
 * @date 2020/1/17 10:06
 * @description
 */
public class ListDelete {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        /*for (int i = 0; i < list.size(); i++) {
            System.out.println("集合尺寸"+list.size()+"当前数据"+i);
            if(list.get(i).equals("C")){
                list.remove(i);
                i--;
            }
        }*/
        list.remove("F");
        for (Object o : list) {
            System.out.println(o.toString());
        }
    }
}
