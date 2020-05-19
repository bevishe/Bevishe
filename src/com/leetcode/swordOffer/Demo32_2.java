package com.leetcode.swordOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Demo32_2
 * @Description TODO
 * @Date 2020/5/4 22:12
 * @Created by Administrator
 */
public class Demo32_2 {

    //

    private ArrayList<ArrayList<Integer>> reArrayList = new ArrayList<>();

    // 使用递归的思想 每次将该层的节点信息返回
    public ArrayList reversive(ArrayList<TreeNode> queue){
        ArrayList<TreeNode> nextQueue = new ArrayList<>();
        ArrayList<Integer> curArray = new ArrayList<>();
        while(queue.size() != 0){
            TreeNode curNode = queue.remove(0);
            curArray.add(curNode.val);
            if(curNode.left != null) nextQueue.add(curNode.left);
            if(curNode.right != null) nextQueue.add(curNode.right);
        }
        if(nextQueue.size() == 0) return reArrayList;
        else return reversive(nextQueue);
    }

    public static void main(String[] args) {

    }
}
