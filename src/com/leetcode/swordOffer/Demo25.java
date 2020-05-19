package com.leetcode.swordOffer;

/**
 * @Classname Demo25
 * @Date 2020/4/24 9:11
 * @Created by Administrator
 */
public class Demo25 {

    // 使用双指针进行遍历
    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        // 递归终止条件
        if(l1 == null) return l2;
        else if(l2 == null) return l1;
        // l1，l2没有为空的继续递归
        else{
            // 总是把小的投节点赋值个第一个参数
            if(l1.val > l2.val){
                ListNode temp = l2;
                l2 = l1;
                l1 = temp;
            }
            ListNode curL1 = l1,curl2 = l2;
            // 找到在l1中需要插入的节点的位置，curL1是最后一个小于l2第一个节点的值
            while(curL1.next != null && curL1.next.val <= curl2.val){curL1 = curL1.next;}
            if(curL1.next == null){
                curL1.next = l2;
                return mergeTwoLists(l1,null);
            }

            // 找到在l2中需要插入的子链
            while(curl2.next != null && curl2.val <= curL1.next.val && curl2.next.val <= curL1.next.val){
                curl2 = curl2.next;
            }
            //
            ListNode l1Next = curL1.next,newL2 = curl2.next;
            curl2.next = null;
            curL1.next = l2;
            curl2.next = l1Next;

            return mergeTwoLists(l1,newL2);

        }
    }

    public static void main(String[] args) {
        Demo25 demo25 = new Demo25();

    }
}
