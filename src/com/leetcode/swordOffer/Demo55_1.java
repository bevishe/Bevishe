package com.leetcode.swordOffer;

/**
 * @Classname Demo55_1
 * @Description TODO
 * @Date 2020/4/9 16:30
 * @Created by Administrator
 */
public class Demo55_1 {


    public int maxDepth(TreeNode root){
        // 直接使用递归的思想来求解
        if(root == null) return 0;
        else return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }

    public static void main(String[] args) {

    }
}
