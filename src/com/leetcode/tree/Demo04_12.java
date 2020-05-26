package com.leetcode.tree;

public class Demo04_12 {


    private int re = 0;
    public int pathSum(TreeNode root, int sum) {
        // 递归的前序
        if(root == null) return 0;
        dfs(root,sum);
        return re;
    }

    public void dfs(TreeNode root,int num){
        if(root == null) return;
        findLoad(root,num);
        dfs(root.left,num);
        dfs(root.right,num);
    }

    // 回溯
    public void findLoad(TreeNode curNode,int num){
        if(curNode == null) return;
        if(num == 0) re++;
        findLoad(curNode.left,num-curNode.val);
        findLoad(curNode.right,num - curNode.val);
        num += curNode.val;
    }

    public static void main(String[] args) {

    }
}
