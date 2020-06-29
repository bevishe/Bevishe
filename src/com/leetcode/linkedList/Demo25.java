package com.leetcode.linkedList;

/**
 * @Classname Demo25
 * @Description TODO
 * @Date 2020/6/19 0:02
 * @Created by Administrator
 */


public class Demo25 {
    public ListNode reverseKGroup(ListNode head,int k){
        // 对链表中每k个链表进行反转
        int curLenght = 1;
        ListNode newHead = head,tail = head;
        while(tail == null){
            if(k == curLenght){
                ListNode nextHead = tail.next;
                tail.next = null;

            }else{
                tail = tail.next;
                curLenght ++;
            }
        }
        return head;
    }


    // 使用递归的方法将链表反转
    public ListNode re(ListNode pre,ListNode cur,ListNode next){
        cur.next = pre;
        pre = cur;
        cur = next;
        if(next == null) return pre;
        next = next.next;
        return re(pre,cur,next);
    }



    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        Demo25 demo25 = new Demo25();
        ListNode reNode = demo25.re(null,head,head.next);
        System.out.println(reNode.val);
        System.out.println(reNode.next.val);
        System.out.println(reNode.next.next.val);
    }
}

class ListNode {
   int val;
    ListNode next;
    ListNode(int x) { val = x; }
}






