package com.leetcode.swordOffer;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;
import sun.util.resources.cldr.ar.CalendarData_ar_YE;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Classname Demo32_3
 * @Description TODO
 * @Date 2020/5/5 22:21
 * @Created by Administrator
 */
public class Demo32_3 {

    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> arrayLists = new ArrayList<>();
        if(root == null) return arrayLists;
        else{
            Stack<TreeNode> stack = new Stack<>();
            Stack<TreeNode> nextStack = new Stack<>();
            stack.push(root);
            int flag = 1; // 1代表从左到右，-1代表从右到左
            while(!stack.isEmpty()){
                ArrayList<Integer> curLevel = new ArrayList<>();
                while(!stack.isEmpty()){
                    TreeNode curNode = stack.pop();
                    curLevel.add(curNode.val);
                    if(flag == 1){
                        if(curNode.left != null) nextStack.push(curNode.left);
                        if(curNode.right != null) nextStack.push(curNode.right);
                    }else{
                        if(curNode.right != null) nextStack.push(curNode.right);
                        if(curNode.left != null) nextStack.push(curNode.left);
                    }
                }
                arrayLists.add(curLevel);
                flag *= -1;
                stack = nextStack;
                nextStack = new Stack<>();
            }
            return arrayLists;
        }
    }


    public static void main(String[] args) {

    }
}
