package com.sjyang.集合.List集合;

import java.util.List;

/**
 * @author saijun.yang
 * @date 2020/4/22 10:19
 * @description 如果集合初始化为null,遍历时会出错吗
 */
public class NullListUse {
    public static void main(String[] args) {
        List list = null;
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
