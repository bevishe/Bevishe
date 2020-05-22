package com.leetcode.swordOffer;

import java.util.Stack;

/**
 * @Classname Demo28
 * @Description TODO
 * @Date 2020/5/2 18:27
 * @Created by Administrator
 */
public class Demo28 {

    // 判断这个树是否是镜像的
    // 可以使用递归的思想

    // 使用的是非递归的思想
    public boolean isSymmetric(TreeNode root){
        if(root == null) return true;
        Stack<TreeNode> stackL = new Stack<>();
        Stack<TreeNode> stackR = new Stack<>();
        if (root.left != null && root.right != null) {
            stackL.push(root.left);
            stackR.push(root.right);
            // 根据对左子树的遍历来判断右子树是否和左子树一样的结构
            while(!stackL.isEmpty()){
                TreeNode curL = stackL.pop(),curR = stackR.pop();
                if(curL.val != curR.val) return false;
                if(curL.left != null){
                    if(curR.right == null) return false;
                    else{
                        stackL.push(curL.left);
                        stackR.push(curR.right);
                    }
                }else{
                    if(curR.right != null) return false;
                }
                if(curL.right != null){
                    if(curR.left == null) return false;
                    else{
                        stackL.push(curL.right);
                        stackR.push(curR.left);
                    }
                }else{
                    if(curR.left != null) return false;
                }
            }
            return true;
        }else if(root.left == null && root.right == null) return true;
        else return false;
    }


    // 就是递归的遍历左子树和右子树是否值相同
    public boolean recursive(TreeNode left,TreeNode right){
        if(left == null && right == null) return true;
        else if(left == null || right == null || left.val != right.val) return false;
        return recursive(left.left,right.right) && recursive(left.right,right.left);
    }

    public static void main(String[] args) {

    }
}
