package com.leetcode.swordOffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Classname Demo34
 * @Description TODO
 * @Date 2020/5/9 23:04
 * @Created by Administrator
 */
public class Demo34 {

    List<List<Integer>> reList = new ArrayList<>();
    List<Integer> curList = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root,int sum){
        // 使用回溯法
        // 使用前序优先遍历，同时使用list记录当前路径的加权和，小于可以继续向下，大于等于可以对当前节点进行减枝操作
        if(root == null)return reList;
        else rever(root,sum);
        return reList;
    }

    // 节点是在他的两个字孩子都访问完了之后回溯的
    public void rever(TreeNode node,int curtar){
        if(node == null) return;
        curtar -= node.val;
        curList.add(node.val);
        if(node.left == null && node.right == null && curtar ==0) reList.add(new ArrayList<>(curList));
        rever(node.left,curtar);
        rever(node.right,curtar);

        curList.remove(curList.size() - 1);
        curtar += node.val;

    }

    public static void main(String[] args) {

    }
}
