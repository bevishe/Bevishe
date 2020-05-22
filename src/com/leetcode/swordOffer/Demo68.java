package com.leetcode.swordOffer;

/**
 * @Classname Demo68
 * @Description TODO
 * @Date 2020/4/7 9:08
 * @Created by Administrator
 */
public class Demo68 {

    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        TreeNode re = root;
        re = commonAncestor(root,p,q);
        return re;
    }

    public TreeNode commonAncestor(TreeNode root,TreeNode p,TreeNode q){
        // 这是一个递归程序
        // 返回最终结果的条件
        if(p.val < root.val && q.val < root.val) return commonAncestor(root.left,p,q);
        else if(p.val > root.val && q.val > root.val) return commonAncestor(root.right,p,q);
        else return root;
    }

    public static void main(String[] args) {

    }
}
