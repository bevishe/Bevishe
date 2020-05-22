package com.leetcode.swordOffer;

import java.util.ArrayList;
import java.util.Queue;

/**
 * @Classname Demo32_1
 * @Description TODO
 * @Date 2020/5/4 22:04
 * @Created by Administrator
 */
public class Demo32_1 {

    public int[] levelOrder(TreeNode root){
        ArrayList<Integer> arrayList = new ArrayList<>();
        // 直接使用层次遍历的方法来遍历二叉树
        ArrayList<TreeNode> queue = new ArrayList<>();
        if(root == null) return new int[0];
        else{
            queue.add(root);
            while(queue.size() != 0){
                TreeNode curNode = queue.remove(0);
                arrayList.add(curNode.val);
                if(curNode.left != null) queue.add(curNode.left);
                if(curNode.right != null) queue.add(curNode.right);
            }
        }
        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args) {

    }
}
