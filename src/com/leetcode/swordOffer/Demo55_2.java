package com.leetcode.swordOffer;

import java.util.Stack;

/**
 * @Classname Demo55_2
 * @Description TODO
 * @Date 2020/4/9 16:33
 * @Created by Administrator
 */
public class Demo55_2 {

    public boolean isBalanced(TreeNode root){
        // 是不是也可以用递归的思想来解决
        // 使用迭代式的前序优先遍历
        Stack<TreeNode> stack = new Stack<>();
        if(root == null) return true;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode curnode = stack.pop();
            if(Math.abs(depth(curnode.left) - depth(curnode.right))>1) return false;
            if(curnode.right != null) stack.push(curnode.right);
            if(curnode.left != null) stack.push(curnode.left);
        }

        return true;
    }

    public int depth(TreeNode root){
        if(root == null) return 0;
        else return 1 + Math.max(depth(root.left),depth(root.right));
    }

    public static void main(String[] args) {

    }
}
