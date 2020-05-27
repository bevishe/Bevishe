package com.leetcode.recursive;

import sun.text.normalizer.ICUData;

public class Demo687 {

    private int maxLength = 0;
    public int longestUnivaluePath(TreeNode root) {
        if(root == null ) return 0;
        dfs(root);
        return maxLength;
    }

    public void dfs(TreeNode curNode){
        if(curNode == null) return;
        else{
            maxLength = Math.max(maxLength,getTheLength(curNode,curNode));
        }
        dfs(curNode.left);
        dfs(curNode.right);
    }

    // 求以curNode为根节点的最长路径是多长 + 递归解决
    public int getTheLength(TreeNode curNode,TreeNode pre){
        if(curNode == null) return 0;
        if(curNode.val == pre.val) {
            return 1 + Math.max(getTheLength(curNode.left,curNode),getTheLength(curNode.right,curNode));
        }
        else return 0;
    }

    public static void main(String[] args) {

    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}