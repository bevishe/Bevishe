package com.leetcode.swordOffer;

import java.util.Stack;

/**
 * @Classname Demo7
 * @Description TODO
 * @Date 2020/2/16 11:00
 * @Created by Administrator
 */

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;


    public TreeNode(int val) {
        this.val = val;
    }
}

public class Demo7 {

    public static TreeNode buildTree(int[] preorder,int[] inorder){
        //非递归的方法
        Stack<TreeNode> stack = new Stack<>();
        int index = 0;
        TreeNode tempNode = null;



        while(index<preorder.length){
            if(stack.empty()){
                stack.push(new TreeNode(preorder[index]));
                index++;
                continue;
            }else{
                tempNode = stack.peek();
                stack.push(new TreeNode(preorder[index]));

                if(getIndex(inorder,tempNode.val)<getIndex(inorder,preorder[index])){
                    System.out.println("父节点："+tempNode.val+"右孩子："+stack.peek().val);
                    tempNode.right = new TreeNode(preorder[index]);
                }else{
                    System.out.println("父节点："+tempNode.val+"左孩子："+stack.peek().val);
                    tempNode.left = new TreeNode(preorder[index]);
                }
            }

            if(getIndex(inorder,stack.peek().val)==0&&getIndex(preorder,inorder[getIndex(inorder,stack.peek().val)+1])<index){
                System.out.println("节点"+stack.peek().val+"出栈");
                stack.pop();

            }
            else if(getIndex(inorder,stack.peek().val)==inorder.length-1&&getIndex(preorder,inorder[getIndex(inorder,stack.peek().val)-1])<index) {
                System.out.println("节点"+stack.peek().val+"出栈");
                stack.pop();

            }
            else if(getIndex(preorder,inorder[getIndex(inorder,stack.peek().val)+1])<index||getIndex(preorder,inorder[getIndex(inorder,stack.peek().val)-1])<index) {
                System.out.println("节点"+stack.peek().val+"出栈");
                stack.pop();
            }
            index ++;

        }
        while(stack.size()>1) stack.pop();
        TreeNode root = stack.pop();
        //TreeNode root = null;
        System.out.println(root.val);
        return root;
    }

    public static int getIndex(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] pre = {3,9,20,15,7};
        int[] ord = {9,3,15,20,7};

        TreeNode t = buildTree(pre,ord);




    }

}
