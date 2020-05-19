package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Demo144
 * @Description TODO
 * @Date 2020/3/30 20:57
 * @Created by Administrator
 */

/*
* 二叉树的前序遍历
*
*
* */

public class Demo144 {

    public List<Integer> preorderTraversal(TreeNode root){
        // 存储通过前序遍历上节点上的值
        List<Integer> list = new ArrayList<>();
        list = preorder(root);
        return list;
    }

    // 二叉树的前序遍历
    // 递归程序需要注意事项：
    /**
     * 1.递归函数的返回值类型
     * 2.递归终止时的条件
     * 3.递归向下递归的时候变量的变化
     * 4.如何将当前层的递归结果传递当上一层
     * */
    public void pre(TreeNode node){
        System.out.println(node.val);
        TreeNode leftNode = node.left;
        if(leftNode != null)
            pre(leftNode);
        TreeNode rightNode = node.right;
        if(rightNode != null)
            pre(rightNode);
    }


    public static List<Integer> preorder(TreeNode node){
        // 递归程序
        // 终止条件

        // 返回值用List集合
        List<Integer> list = new ArrayList<>();
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();

        if(node != null) list.add(node.val);
        if(node != null && node.left != null) {leftList = preorder(node.left); list.addAll(leftList);}
        if(node != null && node.right != null) {rightList = preorder(node.right); list.addAll(rightList);}
        return list;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x){
        val = x;
    }
}
