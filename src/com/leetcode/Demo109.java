package com.leetcode;

/**
 * @Classname Demo109
 * @Description TODO
 * @Date 2020/3/31 16:50
 * @Created by Administrator
 */

/*
* 将链表中的数据构建为一个完全平衡树
* */
public class Demo109 {

    public TreeNode sortedListToBST(ListNode head){
        TreeNode root = new TreeNode(0);
        if(head == null) {root = null;return root;}
        translate(root,head);
        return root;
    }

    // 递归构建的应该是子树
    public void translate(TreeNode curNode,ListNode curList){
        // 找到当前链表的中间节点
        ListNode slowPtr = curList,fastPtr = curList;
        // 将快指针移动到最后节点，慢节点指向的就是中心节点
        while(fastPtr != null && fastPtr.next != null && fastPtr.next.next != null){slowPtr = slowPtr.next; fastPtr = fastPtr.next.next;}
        // 开始构建二叉树,需要注释slowPtr是否是null
        curNode = new TreeNode(slowPtr.val);
        // 递归构建左子树和右子树
        ListNode leftNode,rightNode,lastNode = curList;
        rightNode = slowPtr.next;
        leftNode = curList;
        if(curList == slowPtr) leftNode = null;
        else{
            while(lastNode.next != slowPtr) lastNode = lastNode.next;
            lastNode.next = null;
        }

        if(leftNode != null) translate(curNode.left,leftNode);
        if(rightNode != null) translate(curNode.right,rightNode);
    }


    public static void main(String[] args) {

    }
}
