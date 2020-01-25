package com.leetcode;

public class Demo25 {


    /*
    * k个一组翻转链表
    * 使用递归的方法来实现：
    * */

    public static ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode pre = null,cur = head,next = head.next;

        cur.next = pre;


        return next;
    }

    public static void main(String[] args) {

    }
}