package com.sjyang.基本数据类型.longTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author saijun.yang
 * @date 2020/4/9 14:54
 * @description List移除元素
 */
public class LongList {
    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(2L);
        list.remove(3L);
        List<Long> list2 = new ArrayList<>();
        list2.add(1L);
        list2.add(3L);
        list.removeAll(list2);
        list.addAll(null);
        System.out.println(list.size());
    }
}
