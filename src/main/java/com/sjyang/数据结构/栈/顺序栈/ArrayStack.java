package com.sjyang.数据结构.栈.顺序栈;

/**
 * @author saijun.yang
 * @date Created in 2019/9/9 15:46
 * @description 顺序栈
 * 不支持动态扩容
 * @modified By
 */
public class ArrayStack<E> {
    private E data[];
    private int maxNum;
    private int top;
    public ArrayStack(){
        this.maxNum = 10;
        this.top = 0;
        data = (E[])new Object[maxNum];
    }
    public boolean isNull(){
        return top == 0;
    }
    public boolean isFull(){
        return top == maxNum;
    }
    public void push(E e){
        if(!isFull()){
            data[top] = e;
            top++;
        }else{
            throw new RuntimeException("The Stack is Full,don't push anymore Element");
        }
    }
    public E pop(){
        if(!isNull()){
            E e = data[top-1];
            data[top-1] = null;
            top--;
            return e;
        }else{
            throw new RuntimeException("The Stack is null,don't pop anymore Element");
        }
    }

    public void iterator(){
        for (int i = 0; i < top; i++) {
            System.out.println(data[i]);
        }
    }
}
