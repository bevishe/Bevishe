package com.leetcode;

public class Demo19 {

    /**
     *  快慢指针：
     */
    public ListNode removeNthFromEnd(ListNode head,int n){
        // 给定一个有效值n,可以将链表中的倒数第n个元素删除，并返回链表的头结点，尽量只遍历一次链表实现
        /*
        * 方法1：第一次遍历链表获取链表的长度l，然后第二次遍历l-n个元素，将该元素删除并将链表拼接即可，时间复杂度是O（m（m/2））
        * 方法2：设置两个两个指针，两个指针之间距离n-1，当最后一个指针到达链表结尾时，前一个指针指向的就是所要删除的链表元素
        *
        * */
        // 1.设置前后两个指针,两个指针之间的距离l
        if(head.next==null && n==1){
            head = null;
            return head;
        }
        ListNode first = head,second = head;
        int l=0;
        while(second.next!=null){
            if(l==n){//两个指针之间距离达到了要求，两个指针同时向后移动
                second = second.next;
                first = first.next;
            }else{
                second = second.next;
                l += 1;
            }
        }
        // 判断删除的元素是否是head，如果是需要对head重新赋值
        if(first==head && l != n){
            head = head.next;
            return head;
        }

        // 2.删除first所指向的后面一个元素
        first.next = first.next.next;
        return head;
    }

    public static void main(String[] args) {



    }
}

class ListNode{
    int val;
    ListNode next;


    ListNode(int x){val =x;}
}