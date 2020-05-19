package com.leetcode.swordOffer;

import java.util.Stack;

/**
 * @Classname Demo26
 * @Description TODO
 * @Date 2020/5/1 0:31
 * @Created by Administrator
 */
public class Demo26 {


    // 判断b是否是a的子结构,前序遍历 + 判断该节点是否是判断该节点下的子树是否b的子树
    public boolean isSubStructure(TreeNode A,TreeNode B){
        if(B == null || A == null) return false;
        else{ // B非空树的时候，需要判断
            // 先序遍历树A
            Stack<TreeNode> stackA = new Stack<>();
            stackA.push(A);
            while(!stackA.isEmpty()){
                TreeNode curNode = stackA.pop();
                // 判断当前节点的子树是否是b的根节点
                if(curNode.val == B.val && this.isChildrenTree(curNode,B)){
                    return true;
                }
                if(curNode.right != null) stackA.push(curNode.right);
                if(curNode.left != null) stackA.push(curNode.left);
            }
            return false;
        }
    }

    // 判断以B是否是A为节点开始的子树
    public boolean isChildrenTree(TreeNode A,TreeNode B){
        Stack<TreeNode> stackA = new Stack<>();
        Stack<TreeNode> stackB = new Stack<>();

        stackA.push(A);
        stackB.push(B);
        while(!stackB.isEmpty()){
            if(stackA.isEmpty()) return false;
            else{
                TreeNode curA = stackA.pop(),curB = stackB.pop();
                if(curA.val != curB.val)  return false;
                else{
                    if(curB.right != null){
                        stackB.push(curB.right);
                        if(curA.right == null) return false;
                        else stackA.push(curA.right);
                    }
                    if(curB.left != null){
                        stackB.push(curB.left);
                        if(curA.left == null) return false;
                        else stackA.push(curA.left);
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // todo 该题还可以用递归的方法来做

    }
}
