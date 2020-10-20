package com.dataStructure.linkList;

public class Demo1 {

    /**
     * 单链表的添加
     * 在节点p之后添加q
     * */
    public static void addAfter(Node head,int p,int q){
        Node cur = head;
        while(cur != null && cur.val != p){
            cur = cur.next;
        }

        // 如果cur == null 则表示找不到p
        if(cur != null){
            Node node = new Node(q);
            node.next = cur.next;
            cur.next = node;
        }

    }


    public static void print(Node head){
        Node cur = head;
        while(cur != null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        print(head);
        addAfter(head,2,6);
        print(head);



    }
}
