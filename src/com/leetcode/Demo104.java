package com.leetcode;

/**
 * @Classname Demo104
 * @Description TODO
 * @Date 2020/3/31 13:24
 * @Created by Administrator
 */
public class Demo104 {

    private int deep = 0;
    public int maxDepth(TreeNode root){
        int deep = 0;
        deep = root != null ? 1:0;
        deep = dfs(root);
        return deep;
    }

    // 使用递归的思想来解决问题
    // 返回值类型以需要的结果为导向
    public int dfs(TreeNode root){
        // 递归函数，返回值是当前节点所在的深度
        if(root == null) return 0;
        else
            return Math.max(dfs(root.left),dfs(root.right))+1;
    }


    public static void main(String[] args) {

    }
}
