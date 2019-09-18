package com.sjyang.数据结构.队列.顺序队列;

/**
 * @author saijun.yang
 * @date Created in 2019/9/10 15:56
 * @description 顺序队列
 * 主要注意点：
 * 1.判断队满和队空
 * 2.使用head和tail进行判断存储位置
 * 3.动态扩展与非动态扩展(这里进行非动态扩展)
 * 4.这里默认使用字符串存储类型
 * 5.入列出列时当tail=队列大小时，进行一次整体的数据迁移
 *
 * @modified By
 */
public class ArrayQueue {
    private String[] item;
    private int n = 0,head = 0,tail = 0;
    public ArrayQueue(int capacity){
        this.item = new String[capacity];
        n = capacity;
    }

    /**
     * 入队列
     * 判断是否队满
     * 移动队尾tail
     * 如果满了，查看head是否在头部，无则整体数据迁移
     * @param element
     */
    public void enqueue(String element){
        if(tail == n){
            if(head == 0){
                throw new RuntimeException("队列已满，无法入队");
            }else{
                for (int i = head; i < tail; i++) {
                    item[i - head] = item[i];
                }
                tail = tail - head;
                head = 0;
            }
        }
        item[tail] = element;
        tail++;
    }

    /**
     * 出队列
     * @return
     */
    public String dequeue(){
        if(head == tail){
            throw new RuntimeException("队列已空，无法出队");
        }
        String rem = item[head];
        ++head;
        return rem;
    }

}
