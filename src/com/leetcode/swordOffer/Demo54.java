package com.leetcode.swordOffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Classname Demo54
 * @Description TODO
 * @Date 2020/4/9 16:49
 * @Created by Administrator
 */
public class Demo54 {


    public int kthLargest(TreeNode root,int k){
        // 使用中序遍历的方法，将遍历到的元素一次存放到ArrayList中去，就可以直接取到第k大的节点
        ArrayList<Integer> arrayList = new ArrayList<>();

        //使用迭代的方法来中序遍历
        Stack<TreeNode> stack = new Stack<>();
        while(!stack.isEmpty() || root != null){
            // 中序遍历的思想是，左子树压榨，若子树还有左子树继续压栈，玩了之后弹栈，访问当前将当前节点的右子树继续压栈
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            if(!stack.isEmpty()){
                TreeNode node = stack.pop();
                arrayList.add(node.val);
                root = node.right;
            }
        }
        return arrayList.get(arrayList.size() - k);
    }

    public static void main(String[] args) {

    }
}
