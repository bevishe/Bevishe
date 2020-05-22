package com.leetcode;

/**
 * @Classname Demo617
 * @Description TODO
 * @Date 2020/4/1 19:16
 * @Created by Administrator
 */


public class Demo617 {

    /*
    * 合并二叉树
    * 要求是：相同位置的元素相加，若有一颗没有则不用元素相加
    *
    * */
    public TreeNode mergeTrees(TreeNode t1,TreeNode t2){
        // 为啥可以使用递归的思想
        // 先对t1进行先序遍历
        if(t1 == null) return t2;
        if(t2 == null) return t1;

        t1.val += t2.val;
        t1.left = mergeTrees(t1.left,t2.left);
        t1.right = mergeTrees(t1.right,t2.right);

        return t1;
    }


    public static void main(String[] args) {

    }
}
