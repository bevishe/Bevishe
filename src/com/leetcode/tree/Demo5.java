package com.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Demo5 {

    public boolean isValidBST(TreeNode root) {
//        // 使用递归的思想，通过检查每一个小的树是否合规来累加判断整个树是否是二叉搜索树
//        // 终止条件  todo [10,5,15,null,null,6,20]  这个就是错误的
//        if(root==null) return true;
//        if(root.left == null && root.right == null) return true;
//        else if(root.right == null && root.left.val < root.val) return isValidBST(root.left);
//        else if(root.left == null && root.right.val > root.val) return isValidBST(root.right);
//        else if(root.left != null && root.right != null && root.left.val < root.val && root.right.val > root.val)
//            return isValidBST(root.left)&&isValidBST(root.right);
//        else return false;



        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null) return true;
        TreeNode p = root;
        while(p!= null || !stack.isEmpty()){
            // 将当前栈顶元素的左子树都压站进来
            while(p!= null){
                stack.push(p);
                p = p.left;
            }
            if(!stack.isEmpty()){
                p = stack.pop();
                res.add(p.val);
                p = p.right;
            }
        }

        /***
         stack.push(root);
         while(!stack.isEmpty()){
            while(stack.peek().left!=null){
                stack.push(stack.peek.left);
            }
            TreeNode node = stack.pop();
            node = stack.pop();
            if(node.right != null) stack.push(node.right);

         }



         */

        for (int i = 1; i < res.size(); i++) {
            if(res.get(i)<res.get(i-1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
