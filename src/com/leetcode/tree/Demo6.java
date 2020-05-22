package com.leetcode.tree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Stack;

public class Demo6 {

    // 找到节点p的下一个节点，使用双指针+非递归的中序遍历
    /*
    * 有问题需要解决nextNode 可能在当前节点的右孩子
    * */
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode curNode = root,nextNode = null;
        if(curNode == null) return null;
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<TreeNode> arrayList = new ArrayList<>();
        while(curNode!= null || !stack.isEmpty()){
            while(curNode!=null){
                stack.push(curNode);
                curNode = curNode.left;
            }
            if(!stack.isEmpty()){
                curNode = stack.pop();
                arrayList.add(curNode);
                curNode = curNode.right;
            }
        }
        for (int i = 0; i < arrayList.size() ; i++) {
            if(arrayList.get(i) == p)
                nextNode = i < arrayList.size() - 1 ? arrayList.get(i+1) : null;
        }
        return nextNode;
    }



    public TreeNode extMethod(TreeNode root,TreeNode p){
        TreeNode curNode = root,nextNode = null;
        if(curNode == null) return null;
        Stack<TreeNode> stack = new Stack<>();
        while(curNode != null || !stack.isEmpty()){
            while(curNode != null) {
                stack.push(curNode);
                curNode = curNode.left;
            }
            if(!stack.isEmpty()){
                curNode = stack.pop();
                if(curNode == p) break;
                curNode = curNode.right;
            }
        }
        if(curNode.right != null){
            // 找curNode右孩子最后一个不为null的左孩子节点
            curNode = curNode.right;
            nextNode = curNode.left;
            while(nextNode != null){
                curNode = nextNode;
                nextNode = nextNode.left;
            }
            nextNode = curNode;
        }else if(!stack.isEmpty()){
            // 向上找第一个有
            nextNode = stack.pop();
            while(!stack.isEmpty() && nextNode.right == curNode){
                curNode = nextNode;
                nextNode = stack.pop();
            }
        }
        return nextNode;

    }



    public static void main(String[] args) {

    }
}
