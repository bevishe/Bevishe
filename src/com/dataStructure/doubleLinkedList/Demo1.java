package com.dataStructure.doubleLinkedList;

public class Demo1 {

    // 打印链表
    public static void print(DNode head){
        DNode cur = head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static void addBefore(DNode head,int q,int p){
        DNode cur = head;
        while(cur != null && cur.val != q){
            cur = cur.next;
        }

        //
        DNode node = new DNode(p);
        node.pre = cur.pre;
        cur.pre.next = node;
        node.next = cur;
        cur.pre = node;

    }


    public static void main(String[] args) {
        DNode head = new DNode(1);
        DNode node2 = new DNode(2);
        DNode node3 = new DNode(3);

        head.next = node2;
        node2.next = node3;
        node3.next = null;
        head.pre = null;
        node2.pre = head;
        node3.pre = node2;

        print(head);

        addBefore(head,2,4);
        print(head);

    }
}
