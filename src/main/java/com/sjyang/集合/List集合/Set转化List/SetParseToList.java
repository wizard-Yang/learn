package com.sjyang.集合.List集合.Set转化List;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author saijun.yang
 * @date 2020/11/9 16:02
 * @description 集合转换中，不可变集合问题
 */
public class SetParseToList {
    public static void main(String[] args) {
        Set set = new HashSet<String>();
        for (int i = 0; i < 100; i++) {
            set.add(String.valueOf(i));
        }
        List list = Arrays.asList(set.toArray());
        System.out.println(list);
        //list.add("d");//不可变集合，增加和删除操作抛出异常java.lang.UnsupportedOperationException
        List part = list.subList(0,2);
        System.out.println(part);
    }
}
