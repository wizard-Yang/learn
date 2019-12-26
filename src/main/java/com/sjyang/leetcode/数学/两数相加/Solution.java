package com.sjyang.leetcode.数学.两数相加;

import java.util.ArrayList;
import java.util.List;

/**
 * @author saijun.yang
 * @date 2019/12/11 9:55
 * @description 给出两个 非空 的链表用来表示两个非负的整数。其中，
 * 它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class Solution {
    /**
     * 思路：
     * 1.创建一个结果链表
     * 2.判断计算的两个链表是否下一位为null,为null补0
     * 3.有进位的记录下来，可以使用0或1表示
     * 4.结果链表反转过来就可以了，就是要返回的结果
     * 如何进行下一步骤是个问题，拿什么做条件？如果是递归，递归的终止条件？
     * 可以判断两个链表的下一个值都不为null就继续查询
     * 如果没用递归，可以使用第二变量将链表的next拿到
     *
     * 注意最后一位也可能进位
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbersMe(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p = l1,q = l2,curr = result;
        int jinwei = 0;
        while(p != null || q != null){
            int x = (p == null ? 0 : p.val);
            int y = (q == null ? 0 : q.val);
            curr.next = new ListNode((x + y + jinwei) % 10);
            jinwei = (x + y + jinwei) / 10;
            curr = curr.next;
            if(p != null){
                p = p.next;
            }
            if(q != null){
                q = q.next;
            }
        }
        //处理最后一位进位
        if(jinwei > 0){
            curr.next = new ListNode(jinwei);
        }
        //上面开始处理是从第二位开始的
        return result.next;
    }

    /**
     * 官方解法
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
