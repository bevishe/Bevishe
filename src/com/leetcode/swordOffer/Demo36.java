package com.leetcode.swordOffer;

/**
 * @Classname Demo36
 * @Description TODO
 * @Date 2020/5/10 14:57
 * @Created by Administrator
 */
public class Demo36 {
    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }



    public Node pre = null,tail = null,head;
    public Node treeToDoubleList(Node root){
        if(root == null) return null;
        rever(root);
        head.right = pre;
        pre.left = head;
        return head;

    }

    // 要使用中序遍历的方法
    public void rever(Node node){
        if(node == null) return;
        rever(node.left);
        if(pre == null) head = node;
        else pre.right = node;
        node.left = pre;
        pre = node;

        rever(node.right);
    }

    public static void main(String[] args) {


    }
}
