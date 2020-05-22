package com.leetcode.tree;

public class Demo1002 {

    private int resSum = 0;
    private int curSum = 0;
    public int sumRootToLeaf(TreeNode root) {
        //回溯法 + 后序遍历



        return 0;
    }

    // 如何进行回溯
    public void postDfs(TreeNode root){
        if(root == null) return;
        if(root.left == null && root.right == null){
            resSum += root.val;
        }
        postDfs(root.left);
        postDfs(root.right);
        // 判断当前节点为叶子节点


    }

    public static void main(String[] args) {

    }
}
