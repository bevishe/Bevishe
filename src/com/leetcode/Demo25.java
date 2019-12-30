package com.leetcode;

public class Demo25 {

    private static ListNode cheackIsNull(ListNode head,int k){
        ListNode tempNode = head;
        // 需要判断k个节点，判断k-1个 head 和head。next就行
        for (int i = 0; i < k -1; i++) {
            if(tempNode==null || tempNode.next == null)
                return null;
            if(i == k-2)
                return tempNode;
        }
        return tempNode;
    }

    private static ListNode reverse(ListNode head,ListNode last){
        //对链表进行反转
        ListNode pre,cur,next;
        pre = null;cur = head;next = head;
        while(cur!=null){
            next = cur.next;
            //反转链表节点
            cur.next = pre;
            // 重新给cur，pre，next赋值
            pre = cur;
            cur = next;
        }
        return last;
    }

    public static ListNode reverseKGroup(ListNode head,int k){
        // 使用非递归的方法
        ListNode first,last=null,tempNode = head;
        //找到反转的头和尾
        first = head;
        for (int i = 0; i < k; i++) {
            if(tempNode.next != null) tempNode = tempNode.next;
            else{
                last = tempNode;
                break;
            }
            if(i==k-1) last = tempNode;
        }

        // first和last之间的进行反转,并返回发转链表的新头结点
        ListNode newHead = reverse(first,last);
        // 将反转之后的和未反转的拼接起来
        head.next = last.next;
        return newHead;
    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.addNode(node2);
        node1.addNode(node3);
        node1.addNode(node4);

        ListNode head = reverseKGroup(node1,3);
        System.out.println(head);
    }
}