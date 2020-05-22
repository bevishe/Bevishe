package com.leetcode.tree;

import java.util.Stack;

public class Demo04_10 {


    public boolean checkSubTree(TreeNode t1, TreeNode t2) {
        // 先序遍历找到符合t2.val的节点
        TreeNode root = null;
        Stack<TreeNode> stackT1 = new Stack<>(),stackT2 = new Stack<>();
        stackT1.push(t1);
        while(!stackT1.isEmpty()){
            TreeNode curNode = stackT1.pop();
            if(curNode.val == t2.val){
                root = curNode;
                break;
            }
            if(curNode.left != null) stackT1.push(curNode.left);
            if(curNode.right != null) stackT1.push(curNode.right);
        }
        if(root == null) return false;
        stackT1 = new Stack<>();
        stackT1.push(root);
        stackT2.push(t2);
        while(!stackT2.isEmpty()){
            TreeNode t2Cur = stackT2.pop(),t1Cur = stackT1.pop();
            if(t1Cur.val != t2Cur.val) return false;
            if(t2Cur.left != null){
                if(t1Cur.left == null) return false;
                else {stackT1.push(t1Cur.left);
                        stackT2.push(t2Cur.left);}
            }

            if(t2Cur.right != null){
                if(t1Cur.right == null) return false;
                else{
                    stackT1.push(t1Cur.right);
                    stackT2.push(t2Cur.right);
                }
            }
        }
        return true;
    }
    private TreeNode Root = null;
    public void getTheRoot(TreeNode t1,TreeNode t2){
        if(t1 == null || t2 == null) return;
        else if(t1.val == t2.val) Root = t1;
        getTheRoot(t1.left,t2);
        getTheRoot(t1.right,t2);
    }

    public boolean isSame(TreeNode t1,TreeNode t2){
        if(t1 == null && t2 == null) return true;
        else if(t1 == null || t2 == null){
            return false;
        }else if(t1.val != t2.val) return false;
        else return isSame(t1.left,t2.left) && isSame(t1.right,t2.right);
    }
    // 使用递归的做法
    public boolean exMethod(TreeNode t1,TreeNode t2){
        getTheRoot(t1,t2);
        if(Root == null) return false;
        return isSame(Root,t2);
    }

    public static void main(String[] args) {

    }
}
