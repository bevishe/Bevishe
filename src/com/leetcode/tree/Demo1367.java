package com.leetcode.tree;

public class Demo1367 {


    // 递归（求树节点和链表的第一个节点相同的节点） + 递归（通过该节点的树的向下的路径可以和链表的路径相同）
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(head == null) return false;
        return isSubPath(head,root.left) || isSubPath(head,root.right) || hasLand(head,root);
    }

    // 递归 + 回溯
    /*
    *
    *
    *
    * */
    public boolean hasLand(ListNode head,TreeNode curNode){
        if(head == null) return true;
        if(curNode == null) return false;
        if(head.val !=  curNode.val){
            return false;
        }else{
            return hasLand(head.next,curNode.left) || hasLand(head.next,curNode.right);
        }



    }

    public static void main(String[] args) {

    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}
