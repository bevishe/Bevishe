package com.leetcode.tree;

public class Demo8 {

    // 首个共同的祖先
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 使用递归的思想，不一定是二叉排序树
        // 如果是二叉排序树的话怎么做？
        if(root == p || root == q || root == null) return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left!= null && right !=  null) return root;
        return left !=  null ? left : right;
    }

    public static void main(String[] args) {

    }
}
