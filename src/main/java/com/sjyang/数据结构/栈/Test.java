package com.sjyang.数据结构.栈;

import com.sjyang.数据结构.栈.顺序栈.ArrayStack;

/**
 * @author saijun.yang
 * @date Created in 2019/9/9 15:44
 * @description
 * @modified By
 */
public class Test {
    public static void main(String[] args) {
        ArrayStack<String> arrayStack = new ArrayStack<String>();

        arrayStack.push("A");
        arrayStack.push("B");
        arrayStack.push("C");
        arrayStack.push("D");
        arrayStack.iterator();
        System.out.println("移除栈顶"+ arrayStack.pop());
        arrayStack.iterator();
        System.out.println("移除栈顶"+arrayStack.pop());
        arrayStack.iterator();
        System.out.println("添加栈顶");
        arrayStack.push("sjyang");
        arrayStack.iterator();


    }
}
