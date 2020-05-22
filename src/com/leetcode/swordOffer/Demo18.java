package com.leetcode.swordOffer;

/**
 * @Classname Demo18
 * @Description TODO
 * @Date 2020/3/17 17:33
 * @Created by Administrator
 */
public class Demo18 {

    public ListNode deleteNode(ListNode head,int val){
        if(head == null) return head;
        ListNode begin = head,next = head.next;
        while(next != null){
            if(next.val == val) {
                begin.next = next.next;
                return head;
            }
            begin = begin.next;
            next = next.next;
        }
        return head;
    }

}


