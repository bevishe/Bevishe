package com.leetcode;


import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Demo145
 * @Description TODO
 * @Date 2020/3/31 8:52
 * @Created by Administrator
 */
public class Demo145 {
    public List<Integer> postorderTraversal(TreeNode root){
        // 返回值接收变量
        List<Integer> list = new ArrayList<>();
        list = postorder(root);
        return list;
    }

    public List<Integer> postorder(TreeNode node){
        List<Integer> list = new ArrayList<>();
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();
        if(node != null && node.left != null){leftList = postorder(node.left); list.addAll(leftList);}
        if(node != null && node.right != null){rightList = postorder(node.right);list.addAll(rightList);}
        if(node != null) list.add(node.val);


        return list;
    }
}
