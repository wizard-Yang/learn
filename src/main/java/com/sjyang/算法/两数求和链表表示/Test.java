package com.sjyang.算法.两数求和链表表示;

/**
 * @author saijun.yang
 * @date Created in 2019/7/23 19:12
 * @description 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 
 * 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * @modified By
 */
public class Test {
    public static void main(String[] args) {
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(3);
        b.nextNode = c;
        a.nextNode = b;
        ListNode d = new ListNode(5);
        ListNode e = new ListNode(6);
        ListNode f = new ListNode(4);
        e.nextNode = f;
        d.nextNode = e;
        ListNode result = addTwoNumbers(a,d);
        System.out.println(result);

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);//空结点
        ListNode p = l1,q=l2;
        ListNode result = head;//结果第一位未计算时为0
        int carry = 0;//进位
        while(p!=null || q!=null){
            int x = (p==null)?0:p.val;
            int y = (q==null)?0:q.val;
            int sum = x+y+carry;//第一次也要加carry因为在while循环中
            carry = sum/10;//第一次相加以后，查看进位
            /***
             * !!!!这里重点提一下：
             * 1.因为result被赋值为head的引用，所以我们对result的操作，会直接作用到head对象上
             * 2.第一次head值为0，node为null,在经过下面第一步之后，变为0 node{7,null}
             * 3.经过下面第二行情况时，此时result被重新赋值为{7，null},而且result的引用也被指向了head的nextNode
             * 4.经过第二次循环时，因为result指向的是head的next节点，所以此时head变为0{7，{0，null}}
             * 5.而result再次指向了head的{0，null}这个节点
             * 6.最终返回值是因为head的第一位为0，所以返回head.next
             * 7.至于判断carry大于零是因为最后一位相加可能会进位，而循环中却不会继续循环下去了，所以单独进行处理
             */
            result.nextNode = new ListNode(sum%10);
            result = result.nextNode;
            //判断输入的两个节点是否有下一个节点
            if(p != null)p=p.nextNode;
            if(q != null)q=q.nextNode;
        }
        if(carry > 0){
            result.nextNode = new ListNode(carry);
        }
        return head.nextNode;
    }
}
class ListNode{
    int val;//节点存储值
    ListNode nextNode;//指向的节点
    public ListNode(int val){
        this.val = val;
    }
}