package com.leetcode.swordOffer;

/**
 * @Classname Demo27
 * @Description TODO
 * @Date 2020/5/2 18:03
 * @Created by Administrator
 */
public class Demo27 {

    public TreeNode mirrorTree(TreeNode root){
        // 使用递归的方法
        // 递归结束的条件
        if(root == null) return root;
        exchange(root);
        return root;
    }

    public void exchange(TreeNode root){
        TreeNode tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;
        if(root.left != null) exchange(root.left);
        if(root.right != null) exchange(root.right);
    }



    public static void main(String[] args) {

    }
}
