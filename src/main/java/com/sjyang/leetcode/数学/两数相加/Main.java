package com.sjyang.leetcode.数学.两数相加;

/**
 * @author saijun.yang
 * @date Created in 2019/12/11 10:28
 * @description
 */
public class Main {
    public static void main(String[] args) {
        //807
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode result = new Solution().addTwoNumbersMe(l1,l2);
        ListNode pri = result;
        while(pri != null){
            System.out.println(pri.val);
            pri = pri.next;
        }

    }
}
