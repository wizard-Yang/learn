package com.sjyang.单链表;

/**
 * @author ：saijun.yang
 * @date ：Created in 2019/5/13 19:05
 * @description：单链表实现
 * @modified By：
 * @version:
 */
public class SingleLinkList {
    //头结点
    Node head = null;

    /***
     * 获取链表长度
     * @return
     */
    public int length(){
        int length = 0;
        Node curr = head;
        while(curr != null){
            length++;
            curr = curr.next;
        }
        return length;
    }

    /***
     * 打印节点
     */
    public void printNode(){
        Node temp = head;
        while(temp != null){
            System.out.println("Node:"+temp+";data:"+temp.data);
            temp = temp.next;
        }

    }

    /**
     * 插入节点操作，插入到末尾
     * 将原本最后一个节点的next指向新节点
     * @param node
     */
    public void addNode(Node node){
        Node temp = head;
        if(temp == null){//判断是否为空链表，如果为空，则插入的节点直接作为头结点
            head = node;
            return;
        }
        while(temp.next != null){//遍历找到最后的节点
            temp = temp.next;
        }
        temp.next = node;//将原最后一个节点的指针指向新节点
    }

    /**
     * 将节点插入到指定位置(位置从1开始)
     * 实际上就是从1开始遍历知道找到位置
     * @param index
     * @param node
     */
    public void insertNodeByIndex(int index,Node node){
        //判断插入节点位置是否合法
        if(index < 1 && length() < index){
            System.out.println("插入位置不合法");
        }
        int length = 1;//位置从1开始，代表找到的是前一个地方
        Node temp = head;
        while(temp.next != null){
            if(index == length++){//判断是否达到指定位置
                node.next = temp.next;
                temp.next = node;
                return;
            }
            temp = temp.next;
        }
    }

    /**
     * 删除节点
     * @param index
     */
    public void deleteNode(int index){
        //判断删除节点是否存在
        if(index < 1 || length() < index){
            System.out.println("要删除的节点不存在");
            return;
        }
        //特殊情况-头结点
        if(index == 1){
            head = head.next;
            return;
        }

        Node preNode = head;//头结点-上面已经对该情况验证过，头结点一定有相邻节点
        Node currNode = preNode.next;
        int length = 2;
        while(currNode != null){
            if(index == length){
                preNode.next = currNode.next;
            }
            preNode = preNode.next;
            currNode = currNode.next;
            length++;
        }
    }

    /**
     * 链表排序，并返回头结点
     * 选择排序算法,即每次都选出未排序结点中最小的结点，与第一个未排序结点交换
     * @return
     */
    public Node linkSort(){

        return null;
    }

    /**
     * 去掉重复元素:
     * 需要额外的存储空间hashtable，调用hashtable.containsKey()来判断重复结点
     */
    public void distinctLink(){

    }

    /**
     * 返回倒数第k个结点,
     * 两个指针，第一个指针向前移动k-1次，之后两个指针共同前进，
     * 当前面的指针到达末尾时，后面的指针所在的位置就是倒数第k个位置
     * @param k
     * @return
     */
    public Node findReverNode(int k){
        return null;
    }

    /**
     * 查找正数第k个元素
     */
    public Node findNode(int k){
        return null;
    }

    /**
     * 反转链表，在反转指针钱一定要保存下个结点的指针
     */
    public void reserveLink(){

    }

    /**
     * 反向输出链表，三种方式：
     * 方法一、先反转链表，再输出链表，需要链表遍历两次
     * 方法二、把链表中的数字放入栈中再输出，需要维护额外的栈空间
     * 方法三、依据方法2中栈的思想，通过递归来实现，递归起始就是将先执行的数据压入栈中，再一次出栈
     */
    public void reservePrt(Node node){

    }

    /**
     * 寻找单链表的中间结点：
     * 方法一、先求出链表的长度，再遍历1/2链表长度，寻找出链表的中间结点
     * 方法二、：
     * 用两个指针遍历链表，一个快指针、一个慢指针，
     * 快指针每次向前移动2个结点，慢指针一次向前移动一个结点，
     * 当快指针移动到链表的末尾，慢指针所在的位置即为中间结点所在的位置
     */
    public Node findMiddleNode(){
        return null;
    }

    /**
     * 判断链表是否有环：
     * 设置快指针和慢指针，慢指针每次走一步，快指针每次走两步
     * 当快指针与慢指针相等时，就说明该链表有环
     */
    public boolean isRinged(){
        return false;
    }

    /**
     * 返回链表的最后一个结点
     */
    public Node getLastNode(){
        return null;
    }

    /**
     * 在不知道头结点的情况下删除指定结点：
     * 删除结点的重点在于找出其前结点，使其前结点的指针指向其后结点，即跳过待删除结点
     * 1、如果待删除的结点是尾结点，由于单链表不知道其前结点，没有办法删除
     * 2、如果删除的结点不是尾结点，则将其该结点的值与下一结点交换，然后该结点的指针指向下一结点的后续结点
     */
    public boolean deleteSpecialNode(Node n){
        return false;
    }

    /**
     * 判断两个链表是否相交：
     * 两个链表相交，则它们的尾结点一定相同，比较两个链表的尾结点是否相同即可
     */
    public boolean isCross(Node head1, Node head2){
        return false;
    }


    /**
     * 如果链表相交，求链表相交的起始点：
     * 1、首先判断链表是否相交，如果两个链表不相交，则求相交起点没有意义
     * 2、求出两个链表长度之差：len=length1-length2
     * 3、让较长的链表先走len步
     * 4、然后两个链表同步向前移动，没移动一次就比较它们的结点是否相等，第一个相等的结点即为它们的第一个相交点
     */
    public Node findFirstCrossPoint(SingleLinkList linkedList1, SingleLinkList linkedList2){
        return null;
    }

}
