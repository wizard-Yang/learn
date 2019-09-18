package com.sjyang.数据结构.队列;

import com.sjyang.数据结构.队列.顺序队列.ArrayQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author saijun.yang
 * @date Created in 2019/9/10 14:42
 * @description 队列
 * @modified By
 */
public class Queue implements Cloneable{
    public static void main(String[] args) {
       /* ConcurrentLinkedQueue
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue();*/
       ArrayQueue arrayQueue = new ArrayQueue(5);
       arrayQueue.enqueue("A");
       arrayQueue.enqueue("B");
       arrayQueue.enqueue("C");
       arrayQueue.enqueue("D");
       arrayQueue.enqueue("E");
       System.out.println(arrayQueue.dequeue());
       System.out.println("即将超过队列极限");
       arrayQueue.enqueue("F");

    }

   @Override
   protected Object clone() throws CloneNotSupportedException {
      return super.clone();
   }
}
