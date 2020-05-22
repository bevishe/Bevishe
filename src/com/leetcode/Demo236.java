package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Classname Demo236
 * @Description TODO
 * @Date 2020/3/31 9:02
 * @Created by Administrator
 */


/*
* 二叉树的最近公共祖先
* 给定一个二叉树，找到树中两个指定节点的最近公共祖先
* */

public class Demo236 {

    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q) {
        TreeNode treeNode = root != null ? root : null;


        return treeNode;
    }




    // 这种方法的时间复杂度太高，会超时
//    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
//        // 使用层次遍历的方法，当整层遍历完了之后都没有发现公共节点，则返回当前保存的祖先节点，否则将当前找到的节点赋值给祖先节点
//        TreeNode comAncestor = root != null ? root : null;
//        // 记录当前层和下一层的节点数，和当前节点是否有公共节点
//        int curCount = 0, nextCount = 0;
//        boolean havaCom = false;
//        // 使用queue来实现层次遍历
//        LinkedList<TreeNode> queue = new LinkedList<>();
//        if(root != null) {
//            queue.add(root);
//            curCount ++;
//        }
//        while(!queue.isEmpty()){
//            // 队列出节点
//            TreeNode t = queue.pop();
//            curCount --;
//            // 当层中有公共节点
//            if(isAncestor(t,p,q)) {
//                comAncestor = t;
//                havaCom = true;
//            }
//            if(t.left != null) {queue.add(t.left);nextCount++;}
//            if(t.right != null) {queue.add(t.right); nextCount++;}
//            if(curCount == 0 && havaCom == true){
//                curCount = nextCount;
//                nextCount = 0;
//                havaCom = false;
//            }else if(curCount == 0 && havaCom == false)
//                return comAncestor;
//        }
//        return comAncestor;
//    }

    // 判断p,q是否在node为根的子树上面，使用迭代前序遍历的方法
    public static boolean isAncestor(TreeNode node,TreeNode p,TreeNode q){
        boolean pFlag = false,qFlag = false;
        // 迭代的程序，
        Stack<TreeNode> stack = new Stack<>();
        if(node != null) stack.push(node);
        // 继续迭代的条件
        while(!stack.empty()){
            TreeNode t = stack.pop();
            if(t == p) pFlag = true;
            else if(t == q) qFlag = true;
            if(pFlag && qFlag) return true;
            if(t.left != null) stack.push(t.left);
            if(t.right != null) stack.push(t.right);
        }
        return (pFlag && qFlag) ?true:false;
    }

    public static void main(String[] args) {

    }


        private TreeNode ans;


        private boolean recurseTree(TreeNode currentNode, TreeNode p, TreeNode q) {
            if (currentNode == null) {
                return false;
            }
            int left = this.recurseTree(currentNode.left, p, q) ? 1 : 0;
            int right = this.recurseTree(currentNode.right, p, q) ? 1 : 0;
            int mid = (currentNode == p || currentNode == q) ? 1 : 0;
            if (mid + left + right >= 2) {
                this.ans = currentNode;
            }
            return (mid + left + right > 0);
        }

//        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//            // Traverse the tree
//            this.recurseTree(root, p, q);
//            return this.ans;
//        }



}
