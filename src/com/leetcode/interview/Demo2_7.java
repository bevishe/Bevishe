package com.leetcode.interview;

import java.util.Stack;

public class Demo2_7 {

    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        ListNode reNode = headA;
        if(headA == null || headB == null) return reNode;

        Stack<ListNode> stackA = new Stack<>();
        Stack<ListNode> stackB = new Stack<>();
        ListNode curNode = headA;
        while(curNode != null){
            stackA.push(curNode);
            curNode = curNode.next;
        }
        curNode = headB;
        while(curNode != null){
            stackB.push(curNode);
            curNode = curNode.next;
        }

        ListNode sameNode = null;
        while(!stackA.isEmpty() && !stackB.isEmpty() && stackA.peek() == stackB.peek()){
            sameNode = stackA.peek();
            stackA.pop();
            stackB.pop();
        }

        return reNode;
    }


    public static void main(String[] args) {


    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}