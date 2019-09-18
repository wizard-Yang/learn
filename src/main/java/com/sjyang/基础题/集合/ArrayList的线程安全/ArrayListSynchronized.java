package com.sjyang.基础题.集合.ArrayList的线程安全;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 * @author saijun.yang
 * @date Created in 2019/9/18 9:45
 * @description 线程安全的ArrayList
 */
public class ArrayListSynchronized {
    public static void main(String[] args) {
        //底层实现还是每个方法都加synchronized
        Collections.synchronizedList(new ArrayList());
        LinkedList
    }
}
