package com.leetcode;

import jdk.internal.org.objectweb.asm.util.CheckAnnotationAdapter;

public class Demo23 {

    /*
    * 合并k个排序链表
    * 方法1：设定k个索引，分别指向k个链表，每次遍历k个索引所指向的值，来选择哪个索引需要向后移动
    * 方法2：设定两个指针，每次只合并这两个指针，然后在依次合并后面的一个
    *
    *
    * */

    public static void main(String[] args) {

    }

    public ListNode mergeKLists(ListNode[] lists){
        if(lists.length==1)
            return lists[0];
        else if(lists.length==0)
            return null;
        ListNode head = lists[0];
        for (int i = 1; i < lists.length; i++) {
            head = mergeTwo(head,lists[i]);
        }
        return head;
    }

    public ListNode mergeTwo(ListNode list1,ListNode list2){
        // 创建指针和头结点指向第一值小的list,没有判断list1，和list2是空的情况
        if(list1 == null) return list2;
        else if(list2 == null) return list1;
        ListNode listNodeFirst,listNodeSeconde,head;
        if(list1.val<=list2.val){
            head = listNodeFirst = list1;
            listNodeSeconde = list2;
        }else{
            head = listNodeFirst = list2;
            listNodeSeconde =list1;
        }

        while(listNodeSeconde!=null){
            // list1 和 next向后移动
            while(listNodeFirst.next!=null&&listNodeFirst.val==listNodeFirst.next.val) listNodeFirst = listNodeFirst.next;
            // list1 为空，list2不为空,
            // list1 为空，list2为空
            if(listNodeFirst ==null) listNodeFirst = listNodeSeconde;
            //list1 不为空，list2为空
            else if(listNodeSeconde == null) return head;
            // list1 不为空，list2不为空
            else{
                // 移动listNodeFirst指向的小于listSeconde指向的值，而
                while(listNodeFirst.next!=null && listNodeFirst.val<=listNodeSeconde.val && listNodeFirst.next.val<=listNodeSeconde.val) listNodeFirst = listNodeFirst.next;
                ListNode tempNode = listNodeFirst.next;
                listNodeFirst.next = listNodeSeconde;
                listNodeSeconde = listNodeSeconde.next;
                listNodeFirst.next.next = tempNode;
            }
        }
        return head;
    }
}
