package com.leetcode.swordOffer;

/**
 * @Classname Demo24
 * @Description TODO
 * @Date 2020/4/24 8:51
 * @Created by Administrator
 */
public class Demo24 {


    public ListNode reverseList(ListNode head){
        if(head == null || head.next == null) return head;
        else{
            ListNode firstNode = head,secNode = head.next,thirdNode = secNode.next;
            ListNode tempNode = null;
            firstNode.next = null;
            secNode.next = firstNode;

            firstNode = secNode;
            secNode = thirdNode;
            thirdNode = thirdNode.next;

            while(thirdNode != null){
                secNode.next = firstNode;

                firstNode = secNode;
                secNode = thirdNode;
                thirdNode = thirdNode.next;
            }

            return secNode;
        }
    }

    // 使用递归的思想：总是将第一个和第二个节点交换，第一个节点拼接到第二个节点后面，如果第三个节点不为空，继续递归，否者返回第二个节点

    public static void main(String[] args) {

    }
}
