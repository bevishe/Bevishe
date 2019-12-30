package com.leetcode;

import java.util.List;

public class Demo24 {


    /*
    * 两两交换链表中的节点
    * 方法1：将每两个节点进行交换，
    * 方法2：使用递归来做，递归的结果是一棵二叉树，我们需要使用先序来遍历这棵二叉树
    *
    *
    * */
    public ListNode swapPairs(ListNode head){
        // 递归终止条件
        if(head==null || head.next ==null){
            return head;
        }

        ListNode next = head.next;
        head.next = swapPairs(next);
        next.next = head;
        return next;
    }



    public static void main(String[] args) {

    }
}
