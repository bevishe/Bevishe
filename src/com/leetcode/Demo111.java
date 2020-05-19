package com.leetcode;

import sun.reflect.generics.tree.Tree;

/**
 * @Classname Demo111
 * @Description TODO
 * @Date 2020/4/1 12:27
 * @Created by Administrator
 */
public class Demo111 {

    public int minDepth(TreeNode root) {
        int dep = root == null ? 0 : dp(root);
        return dep;
    }

    public int dp(TreeNode root){
        if(root.left == null && root.right == null) return 1;
        else if(root.left == null) return 1 + this.dp(root.right);
        else if(root.right == null) return 1 + this.dp(root.left);
        else return 1 + Math.min(this.dp(root.left),this.dp(root.right));
    }

    public static void main(String[] args) {

    }
}
