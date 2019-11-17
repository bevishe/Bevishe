package com.leetcode;

public class Demo21 {

    /**
     * 判断指针后移的情况时不要漏，
     * first，second指定位置的四种情况
     */

    /*
    * 合并的两个链表本身就是有序的，合并成一个新的有序链表返回
    *
    *
    * 方法：判断l1.l2的头结点小的赋值给first，另外一个给second，然后
    * */

    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        // 1.对first，second进行赋值
        if(l1==null){
            return l2;
        }else if(l2==null){
            return l1;
        }else if(l1==null && l2==null){
            return l1;
        }
        ListNode first,second,head;
        if(l1.val<=l2.val){
            first = l1;
            second = l2;
        }else{
            first = l2;
            second = l1;
        }
        head = first;

        // 2.对first，second进行遍历{}
        while(first!=null && second!=null){
            // 对在first和second中相同的值，直接指针后移
            while(first.next!=null && first.val==first.next.val) first=first.next;

            // 如果second指向的元素可以添加first中
            if(first.next != null && first.val<=second.val &&first.next.val>second.val){
                ListNode temp_firstNext = first.next;
                first.next = second;
                second = second.next;
                first.next.next = temp_firstNext;
            }else if(first.next!=null){
                first = first.next;
            }
            // 如果first已经到了最后一个元素
            if(first.next == null){
                first.next = second;
                return head;
            }
            if(second==null) return head;
        }
        return head;
    }
}

