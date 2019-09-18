package com.sjyang.基础题.集合.AttayList的克隆;

import java.util.ArrayList;
import java.util.List;

/**
 * @author saijun.yang
 * @date Created in 2019/9/17 13:49
 * @description 集合的克隆地址是否一致？
 */
public class ArrayListClone {
    public static void main(String[] args) {
        ArrayList pre = new ArrayList();
        ArrayList clo = (ArrayList) pre.clone();
        System.out.println(pre==pre.clone());
    }
}
