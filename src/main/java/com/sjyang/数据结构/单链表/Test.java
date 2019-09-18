package com.sjyang.数据结构.单链表;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author ：saijun.yang
 * @date ：Created in 2019/5/13 19:59
 * @description：测试类
 * @modified By：
 * @version:
 */
public class Test {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add(0,2);

        SingleLinkList2<String> singleLinkList2 = new SingleLinkList2<String>();
        singleLinkList2.add("A");
        singleLinkList2.add("B");
        singleLinkList2.add("C");
        singleLinkList2.add("D");
        System.out.println(singleLinkList2.size());
        singleLinkList2.add(2,"E");
        System.out.println(singleLinkList2.size());
        for (int i = 0; i < singleLinkList2.size(); i++) {
            System.out.println(singleLinkList2.get(i));
        }

    }
}
