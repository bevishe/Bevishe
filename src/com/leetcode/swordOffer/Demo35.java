package com.leetcode.swordOffer;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname Demo35
 * @Description TODO
 * @Date 2020/5/10 11:57
 * @Created by Administrator
 */
public class Demo35 {



    public Node copyRandomList(Node head){
        if(head == null) return head;
        Map<Node,Node> map= new HashMap<>();
        Node curNode = head;
        while(curNode != null){
            map.put(curNode,new Node(curNode.val));
            curNode = curNode.next;
        }

        curNode = head;
        while(curNode != null){
            map.get(curNode).next = map.get(curNode.next);
            map.get(curNode).random = map.get(curNode.random);
        }
        return map.get(head);
    }

    public static void main(String[] args) {
        // 使用hash的做法
    }
}
class Node {
    int val;
    Node next;
    Node random;

    Node(){}

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}