package com.leetcode.swordOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * @Classname Demo6
 * @Description TODO
 * @Date 2020/2/15 19:11
 * @Created by Administrator
 */

public class Demo6 {
    /**
     * 从头到尾打印链表
     * */


    public static int[] reversePrint(ListNode head){
        ArrayList<Integer> arrayList = new ArrayList<>();
        int len = 0,i=0;
        ListNode newHead=null,next = head,temp;
        while(next!=null){
            temp = next;
            next = next.next;
            temp.next = newHead;
            newHead = temp;
            len++;
        }

        int[] re = new int[len];
        while(newHead!=null){
            re[i] = newHead.val;
            i++;
            newHead = newHead.next;
        }
        return re;

    }

    public static int[] reversePrintPlus(ListNode head){
        int len = 0;
        ListNode cur = head;
        while(cur != null){
            len++;
            cur = cur.next;
        }
        int [] res = new int[len];
        while(head != null && len > 0){
            res[len-1] = head.val;
            head = head.next;
            len--;
        }

        return res;

    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);

        a.next = b;
        b.next = c;
        c.next = null;
    }
}

class ListNode{
    int val;
    ListNode next;

    ListNode(int x){val = x;}
}