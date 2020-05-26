package com.leetcode.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo1026 {

    private int minNum;
    private int maxNum;
    private int maxAbs;
    private ArrayList<Integer> path = new ArrayList<>();
    // 递归 + 回溯 ： 找到从根到叶子节点路径上面的最大，最小值，然后求取差的绝对值
    public int maxAncestorDiff(TreeNode root) {
        if(root == null) return 0;
        dfs(root);
        return maxAbs;
    }

    // 直接使用递归的话会更加方便，不用使用arrayList数据存储当前路径里面的节点值

    public void dfs(TreeNode root){
        if(root == null) return;
        path.add(root.val);
        // 递归到叶子节点
        if(root.left == null && root.right == null){
            minNum = Collections.min(path);
            maxNum = Collections.max(path);
            maxAbs = Math.max(maxAbs,Math.abs(maxNum-minNum));
        }

        dfs(root.left);
        dfs(root.right);
        path.remove(Integer.valueOf(root.val));
    }

    public static void main(String[] args) {

    }
}
