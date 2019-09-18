package com.sjyang.数据结构.栈.链式栈;

import java.util.Stack;

/**
 * @author saijun.yang
 * @date Created in 2019/9/9 16:21
 * @description 链式栈
 * @modified By
 */
public class LinkedStack {
    private static class Node<E>{
        E data;
        Node<E> next;
        public Node(E e,Node<E> next){
            this.data = e;
            this.next = next;
        }
    }
}
