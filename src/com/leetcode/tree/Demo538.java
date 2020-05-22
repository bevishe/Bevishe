package com.leetcode.tree;

public class Demo538 {

    private int pre = -1;
    private int sum = 0;
    private boolean flag = true;
    // 二叉搜索树 转换成 累加数
    public TreeNode convertBST(TreeNode root) {
        /*
        * 1.进行两次遍历
        *
        * */
        if(root == null) return root;
        dfs(root);
        reTheVal(root);
        return root;
    }

    public void dfs(TreeNode root){
        if(root == null) return;
        dfs(root.left);
        sum += root.val;
        dfs(root.right);
    }

    public void reTheVal(TreeNode root){
        if(root == null) return;
        reTheVal(root.left);
        if(flag){
            pre = root.val;
            root.val = sum;
            flag = false;
        }
        else{
            int temp = root.val;
            root.val = sum - pre;
            sum = root.val;
            pre = temp;
        }
        reTheVal(root.right);
    }

    public static void main(String[] args) {

    }
}
