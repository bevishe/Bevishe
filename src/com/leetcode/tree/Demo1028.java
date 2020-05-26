package com.leetcode.tree;

import java.util.Arrays;

public class Demo1028 {

    public TreeNode recoverFromPreorder(String S) {
        // 从先序遍历还原二叉树
        /*
        * 中序遍历 + 递归
        * */
        int[] nums = Arrays.asList(S.split("-+")).stream().mapToInt(Integer::valueOf).toArray();
        String[] deep = S.split("\\d+");
        int[] deepth = new int[deep.length];
        for (int i = 0; i < deep.length; i++) {
            deepth[i] = deep[i].length();
        }
        TreeNode root = new TreeNode(nums[0]);
        TreeNode lastNode = dfs(root,nums,deepth,1,1);
        return root;
    }

    public TreeNode dfs(TreeNode curNode,int[] nums,int[] deepth,int curIndex,int curDeep){
        if(curIndex == nums.length) return curNode;
        if(curDeep == deepth[curIndex - 1]){}

        return null;
    }


    // Arrays.asList()方法返回的ArrayList是Arrays方法中的一个内部类对象，没有实现add，remove方法，只可以用来遍历

    public static void main(String[] args) {

        Demo1028 demo1028 = new Demo1028();
        demo1028.recoverFromPreorder("1-12--12-12-1-121--12");
    }
}
