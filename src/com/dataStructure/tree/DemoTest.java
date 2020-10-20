package com.dataStructure.tree;

import java.util.ArrayList;
import java.util.Stack;

public class DemoTest {


    // 非递归的前序遍历
    public static void pre(TreeNode root){
        System.out.print("非递归的前序遍历：\t");
        if(root == null)  return;
        else{
            Stack<TreeNode> stack = new Stack<>();
            TreeNode curNode = root;
            while(!stack.isEmpty() || curNode != null){
                while(curNode!=null){
                    System.out.print(curNode.value+"\t");
                    stack.push(curNode);
                    curNode = curNode.left;
                }
                if(!stack.isEmpty()){
                    curNode = stack.pop();
                    curNode = curNode.right;
                }
            }
        }
        System.out.println();
    }

    // 递归的前序遍历
    public static void preRecur(TreeNode root){
        if(root != null) System.out.print(root.value+"\t");
        if(root.left != null)preRecur(root.left);
        if(root.right != null)preRecur(root.right);
    }

    // 非递归的中序遍历
    public static void order(TreeNode node){
        if(node == null) return;
        else{
            System.out.print("非递归的中序遍历：\t");
            Stack<TreeNode> stack = new Stack<>();
            TreeNode curNode = node;
            while(!stack.isEmpty() || curNode != null){

                while(curNode != null){
                    stack.push(curNode);
                    curNode = curNode.left;
                }

                if(stack.isEmpty()) break;
                curNode = stack.pop();
                System.out.print(curNode.value+"\t");
                curNode = curNode.right;
            }
        }
        System.out.println();
    }

    // 递归的中序遍历
    public static void orderRecur(TreeNode root){
        if(root.left != null) orderRecur(root.left);
        System.out.print(root.value+"\t");
        if(root.right != null) orderRecur(root.right);
    }


    // 非递归的后序遍历
    public static void post(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curNode = root;

        TreeNode flag = null;

        ArrayList<Integer> ans = new ArrayList<>();
        while(curNode!=null){
            stack.push(curNode);
            curNode = curNode.left;
        }

        while(!stack.isEmpty()){
            curNode = stack.pop();
            if(curNode.right == null || curNode.right == flag){
                ans.add(curNode.value);
            }else {
                stack.push(curNode);
                curNode = curNode.right;
                while(curNode != null){
                    stack.push(curNode);
                    curNode = curNode.left;
                }
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }

    public static void main(String[] args) {
        // 创建一棵树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left  = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // 非递归的前序遍历
        pre(root);
        // 递归的前序遍历
        System.out.print("递归的前序遍历:\t");
        preRecur(root);
        System.out.println();

        // 非递归的中序遍历
        order(root);

        System.out.print("递归的中序遍历：\t");
        orderRecur(root);
        System.out.println();
    }
}
