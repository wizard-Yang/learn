package com.sjyang.link_list;

/**
 * @author ：saijun.yang
 * @date ：Created in 2019/5/13 19:59
 * @description：测试类
 * @modified By：
 * @version:
 */
public class Test {
    public static void main(String[] args) {
        SingleLinkList single = new SingleLinkList();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        //从末尾添加节点
        single.addNode(n1);
        single.printNode();
        System.out.println("----------------------------------------");

        single.addNode(n2);
        single.addNode(n3);
        single.addNode(n4);
        //指定位置添加节点
        single.insertNodeByIndex(2,n5);
        single.printNode();
        System.out.println("-----------------------------------------");
        //删除节点
        //single.deleteNode(10);
        int deleteIndex = 5;
        single.deleteNode(deleteIndex);
        System.out.println("删除第"+deleteIndex+"个节点");
        single.printNode();
    }
}
