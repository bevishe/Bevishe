package com.leetcode.swordOffer;

/**
 * @Classname Demo33
 * @Description TODO
 * @Date 2020/5/5 22:54
 * @Created by Administrator
 */
public class Demo33 {

    // 二叉搜索树的后序遍历序列
    public boolean verifyPostorder(int[] postorder){
        return reversive(postorder,0,postorder.length-1);
    }

    public boolean reversive(int[] postorder,int first,int last){
        if(first >= last) return true;
        // 找到当前节点的第一个遍历到的右孩子
        int left = first,right = first;
        while(right <= last && postorder[right] > postorder[last]) right++;
        //将左右子树分开之后就要开始比较
        int cur = right;
        while(cur < last){
            if(postorder[cur] < postorder[last]) return false;
            cur ++;
        }
        if(right>left){
            return reversive(postorder,first,right-1) && reversive(postorder,right,last-1);
        }else{
            return reversive(postorder,left,last-1);
        }
    }

    public static void main(String[] args) {

    }
}
