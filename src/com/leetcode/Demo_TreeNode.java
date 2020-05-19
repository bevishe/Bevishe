package com.leetcode;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @Classname Demo_TreeNode
 * @Description TODO
 * @Date 2020/4/2 19:46
 * @Created by Administrator
 */
public class Demo_TreeNode {

    // 递归前序遍历
    public void preOrder(TreeNode root){
        if(root != null) System.out.println(root.val);
        if(root.left != null)preOrder(root.left);
        if(root.right != null)preOrder(root.right);
    }

    // 递归中序遍历
    public void inOrder(TreeNode root){

    }

    // 递归后续遍历
    public void postOrder(TreeNode root){

    }

    // 迭代的前序遍历
    public void pre(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        if(root!= null) stack.add(root);
        while(!stack.isEmpty()){
            TreeNode curNode = stack.pop();
            System.out.println(curNode.val);
            if(curNode.right != null) stack.add(curNode.right);
            if(curNode.left!= null) stack.add(curNode.left);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode r1 = new TreeNode(2);
        TreeNode r2 = new TreeNode(3);
        TreeNode r3 = new TreeNode(4);
        TreeNode r4 = new TreeNode(5);
        TreeNode r5 = new TreeNode(6);
        root.left = r1;
        root.right = r3;
        r1.left = null;
        r1.right = r2;
        r2.left = null;
        r2.right =null;
        r3.left = r4;
        r3.right = r5;
        r4.left = null;
        r4.right = null;
        r5.left = null;
        r5.right = null;

        Demo_TreeNode demo = new Demo_TreeNode();
        // 递归实现前序遍历
        demo.preOrder(root);

        // 迭代实现前序遍历
        demo.pre(root);
    }

}
