package com.leetcode.swordOffer;

import java.util.Stack;

/**
 * @Classname Demo52
 * @Description TODO
 * @Date 2020/4/9 17:26
 * @Created by Administrator
 */
public class Demo52 {

    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        if(headA == null || headB == null) return null;
        if(headA == headB) return headA;
        // 使用两个stack，分别将两个链表压栈到两个stack中，然后同时出栈，找到最后一个相同的节点返回即可
        ListNode comNode = null;
        Stack<ListNode> stackA = new Stack<>();
        Stack<ListNode> stackB = new Stack<>();

        // 分别压栈
        ListNode a = headA,b = headB;

        while(a!=null){
            stackA.push(a);
            a = a.next;
        }
        while(b!=null){
            stackB.push(b);
            b = b.next;
        }

        if(stackA.peek() == stackB.peek()){
            comNode = stackA.peek();
            while(!stackA.isEmpty() && !stackB.isEmpty()){
                if(stackA.peek() == stackB.peek()){
                    comNode = stackA.peek();
                    stackA.pop();
                    stackB.pop();
                }else{
                    return comNode;
                }
            }
            return comNode; // 注意可能两个队列从一开始就是连着的
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
