package com.leetcode;

/**
 * @Classname Demo226
 * @Description TODO
 * @Date 2020/4/2 10:11
 * @Created by Administrator
 */
public class Demo226 {


    public TreeNode invertTree(TreeNode root){
        // 返回值肯定是当前树的根
        if(root != null){
            TreeNode tempNode = root.right;
            root.right = root.left;
            root.left = tempNode;
            root.left = invertTree(root.left);
            root.right = invertTree(root.right);
            return root;
        }else {
            return null;
        }
    }


    public static void main(String[] args) {

    }
}
