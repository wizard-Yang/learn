package com.sjyang.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：saijun.yang
 * @date ：Created in 2019/5/24 14:59
 * @description：集合为空时，判断size
 * @modified By：
 * @version:
 */
public class ListIsNull {
    public static void main(String[] args) {
        List list1 = null;
        List list2 = new ArrayList();
        //System.out.println(list1.size());
        System.out.println(list2.size());
    }
}
