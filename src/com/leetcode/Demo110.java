package com.leetcode;

import java.util.LinkedList;

/**
 * @Classname Demo110
 * @Description TODO
 * @Date 2020/4/1 18:18
 * @Created by Administrator
 */
public class Demo110 {
    /*
    * 使用暴力的方法遍历：
    * 1.使用前序遍历，
    * */
    public boolean isBalanced(TreeNode root){
        LinkedList<TreeNode> queue = new LinkedList<>();
        if(root != null) queue.add(root);

        // 使用迭代的方法来先序遍历二叉树
        while(!queue.isEmpty()){
            TreeNode curNode = queue.pop();
            if(Math.abs(maxHeight(curNode.left) - maxHeight(curNode.right)) > 1) return false;
            if(curNode.left != null) queue.add(curNode.left);
            if(curNode.right != null) queue.add(curNode.right);
        }
        return true;
    }

    // 计算当前节点为根的树的最大深度
    public int maxHeight(TreeNode node){
        // 这是递归的程序
        // 终止条件是该节点左右节点都为空
        if(node == null) return 0;
        else if(node.right == null && node.left == null) return 1;
        else return Math.max(maxHeight(node.left),maxHeight(node.right)) + 1;
    }

    public static void main(String[] args) {

    }
}
