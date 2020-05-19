package com.leetcode.swordOffer;
/**
 * @Classname Demo22
 * @Description TODO
 * @Date 2020/4/23 23:12
 * @Created by Administrator
 */
public class Demo22 {

    public ListNode getKthFromEnd(ListNode head,int k){
        // 使用快慢指针的思想，low指针应该比fast慢k-1下
        ListNode fast = head,low;
        while(fast.next !=  null && k-1 > 0) {
            fast = fast.next;
            k--;
        }
        if(k-1 > 0) return head;
        else low = head;
        while(fast.next != null){
            fast = fast.next;
            low = low.next;
        }
        return low;
    }

    public static void main(String[] args) {

    }
}
