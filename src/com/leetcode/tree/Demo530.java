package com.leetcode.tree;

import java.sql.Statement;
import java.util.Stack;

public class Demo530 {

    private int preVal = -1;
    private int minAbs = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root){
        if(root == null) return 0;
        dfs(root);
        return minAbs;
    }


    public void dfs(TreeNode node){
        if(node == null) return;
        dfs(node.left);
        if(preVal != - 1)
            minAbs = Math.min(minAbs,Math.abs(node.val - preVal));
        preVal = node.val;
        dfs(node.right);
    }

    public static void main(String[] args) {

    }
}
