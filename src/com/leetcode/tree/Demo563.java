package com.leetcode.tree;

public class Demo563 {

    public int findTilt(TreeNode root){
        if(root == null) return 0;
        return dfs(root) - root.val;


    }

    public int dfs(TreeNode curNode){
        // 左子树节点之和 - 右子树节点之和的绝对值
        if(curNode == null) return 0;
        return Math.abs(getTheVal(curNode.left)-getTheVal(curNode.right)) + dfs(curNode.left) + dfs(curNode.right);
    }

    public int getTheVal(TreeNode curNode){
        if(curNode == null) return 0;
        int l = curNode.left == null ? 0 : curNode.left.val;
        int r = curNode.right == null ? 0 : curNode.right.val;
        return l + r + getTheVal(curNode.left) + getTheVal(curNode.right);
    }

    public static void main(String[] args) {

    }
}
