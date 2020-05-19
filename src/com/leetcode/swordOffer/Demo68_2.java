package com.leetcode.swordOffer;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @Classname Demo68_2
 * @Description TODO
 * @Date 2020/4/7 9:48
 * @Created by Administrator+
 */
public class Demo68_2 {

    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        TreeNode reNode = root;
        // 使用层次遍历
        LinkedList<TreeNode> queue = new LinkedList<>();
        if(root != null) queue.add(root);
        while(!queue.isEmpty()){
            TreeNode tempNode = queue.pop();
            if(isAncestor(tempNode,p,q)) reNode = tempNode;
            if(tempNode.left!= null) queue.add(tempNode.left);
            if(tempNode.right!= null) queue.add(tempNode.right);
        }
        return reNode;
    }

    // 使用前序遍历，判断当前节点是否是P,q的公共祖先
    public boolean isAncestor(TreeNode root,TreeNode p,TreeNode q){
        Stack<TreeNode> stack = new Stack<>();
        if(root != null){
            boolean pFlag = false,qFlag = false;
            stack.push(root);
            while(!stack.isEmpty()){
                TreeNode tempNode = stack.pop();
                if(tempNode == q) qFlag = true;
                else if(tempNode == p) pFlag = true;

                //
                if(tempNode.right != null) stack.push(tempNode.right);
                if(tempNode.left != null) stack.push(tempNode.left);
            }
            return pFlag&&qFlag;
        }else{
            return false;
        }
    }

    // 递归实现的方法
    public TreeNode lowest(TreeNode root,TreeNode p,TreeNode q){
        // 返回值条件
        if(root == null) return null;
        else if(root == p || root == q) return root;
        root.left = lowestCommonAncestor(root.left,p,q);
        root.right = lowestCommonAncestor(root.right,p,q);
        if(root.left!= null && root.right != null) return root;
        return root.left == null ? root.right:root.left;
    }

    public static void main(String[] args) {

    }
}
