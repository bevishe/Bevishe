package com.leetcode.tree;


import java.util.Map;

public class Demo4 {

    public boolean isBalanced(TreeNode root) {
        // 终止条件
        if(root == null )
            return true;
        else if( Math.abs(depth(root.left) - depth(root.right))<=1)
            return isBalanced(root.left) && isBalanced(root.right);
        else return false;
    }

    public int depth(TreeNode node){
        if(node == null) return 0;
        else return Math.max(depth(node.left),depth(node.right)) + 1;
    }

    public int singleNumber(int[] nums) {
        int ans = 0;
        //int 32位
        for(int i=0;i<32;i++){
            int count =0;
            for(int num:nums){
                if((num&(1<<i))!=0) count++;
            }
            if(count%3!=0) ans += 1<<i;
        }
        return ans;
    }

    public static void main(String[] args) {


        Demo4 demo4 = new Demo4();
        System.out.println(demo4.singleNumber(new int[]{1,1,2,1}));

    }
}
