package com.sjyang.数据结构.单链表;

/**
 * @author saijun.yang
 * @date Created in 2019/9/6 10:41
 * @description 实现单链表
 * @modified By
 */
public class SingleLinkList2<E> {
    Node<E> first;
    private int size = 0;

    //创建一个空链表
    public SingleLinkList2(){
        first = new Node<E>();
    }

    //添加元素到末尾
    public boolean add(E e){
        addLast(e);
        return true;
    }
    //在指定位置添加元素
    public void add(int index,E e){
        if(checkPosition(index)){
            if(index == size){
                addLast(e);
            }else{
                addBefore(e,index);
            }
        }else{
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }
    //从尾部添加
    void addLast(E e){
        if(first.next == null && first.data == null){
            first = new Node(e,null);
        }else{
            Node<E> temp = first;
            for (int i = 0; i < size; i++) {
                if(temp.next == null){
                    temp.next = new Node<E>(e,null);
                    break;
                }
                temp = temp.next;
            }
        }
        size++;
    }
    //指定位置添加
    void addBefore(E e,int index){
        int pos = 0;
        Node<E> curr = first;
        Node<E> pre = first;
        while(pos != index){
            pre = curr;
            curr = curr.next;
            pos++;
        }
        Node<E> node = new Node<E>(e,curr);
        pre.next = node;
        size++;
    }

    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }

    public boolean checkPosition(int index){
        return index >= 0 && index <= size;
    }

    //查找指定位置的元素
    private Node<E> getNode(int index){
        if(checkPosition(index)){
            Node<E> node = first;
            while(index-- > 0){
                node = node.next;
            }
            return node;
        }
        return null;
    }
    //查找指定位置的元素
    public E get(int index){
        if(checkPosition(index)){
            Node<E> node = first;
            while(index-- > 0){
                node = node.next;
            }
            return node.data;
        }
        return null;
    }

    //获取元素数量
    public int size(){
        return this.size;
    }


    //静态内部类
    private static class Node<E>{
        E data;
        Node<E> next;
        public Node(E data,Node<E> next){
            this.data = data;
            this.next = next;
        }
        public Node(){

        }
    }
}
