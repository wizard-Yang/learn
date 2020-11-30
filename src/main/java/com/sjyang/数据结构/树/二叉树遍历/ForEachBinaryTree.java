package com.sjyang.数据结构.树.二叉树遍历;

/**
 * @author saijun.yang
 * @date 2020/9/22 19:44
 * @description 二叉树遍历
 */
public class ForEachBinaryTree {
    public static void main(String[] args) {
        //链式遍历
        Node Node = getBinaryTreeNode();
        preorder(Node);
    }

    public static Node getBinaryTreeNode(){
        Node nodeRootA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");
        Node nodeG = new Node("G");
        nodeRootA.setPreNode(nodeB);
        nodeRootA.setAfterNode(nodeC);
        nodeB.setPreNode(nodeD);
        nodeB.setAfterNode(nodeE);
        nodeC.setPreNode(nodeF);
        nodeC.setAfterNode(nodeG);
        return nodeRootA;
    }

    /**
     * 使用顺序存储树，返回数组
     * root根节点为1   左子节点为 2n   右子节点2n+1
     * @return
     */
    public static String[] getBinaryTreeNodeOrder(){
        String[] tree = new String[8];
        tree[1] = "A";
        tree[2] = "B";
        tree[3] = "C";
        tree[4] = "D";
        tree[5] = "E";
        tree[6] = "F";
        tree[7] = "G";
        return tree;
    }

    /**
     * 前序遍历，链表方式
     */
    public static void preorder(Node node){
        System.out.print(node.getValue());

        if(node.getPreNode() != null){
            System.out.print(node.getPreNode().getValue());
            preorder(node.getPreNode());
        }
        if(node.getAfterNode() != null){
            System.out.print(node.getAfterNode().getValue());
            preorder(node.getAfterNode());
        }

    }
}

class Node{
    private String value;
    private Node preNode;
    private Node afterNode;

    public Node(String value) {
        this.value = value;
    }

    public Node getPreNode() {
        return preNode;
    }

    public void setPreNode(Node preNode) {
        this.preNode = preNode;
    }

    public Node getAfterNode() {
        return afterNode;
    }

    public void setAfterNode(Node afterNode) {
        this.afterNode = afterNode;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}