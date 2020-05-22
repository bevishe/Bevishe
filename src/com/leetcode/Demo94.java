package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Demo94
 * @Description TODO
 * @Date 2020/3/31 8:37
 * @Created by Administrator
 */
public class Demo94 {

    public List<Integer> inorderTraversal(TreeNode root){
        // 使用递归的方法
        List<Integer> list = new ArrayList<>();
        list = inorder(root);
        return list;
    }

    public static List<Integer> inorder(TreeNode node){
        // 递归程序
        //返回值接受变量
        List<Integer> list = new ArrayList<>();

        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();
        if(node!= null && leftList != null) {leftList = inorder(node.left); list.addAll(leftList);}
        if(node != null) list.add(node.val);
        if(node != null && rightList != null){rightList = inorder(node.right); list.addAll(rightList);}
        // 终止条件


        // 返回值
        return list;
    }


    public static void main(String[] args) {

    }
}
