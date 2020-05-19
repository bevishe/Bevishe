package com.leetcode;


import java.util.*;

/**
 * @Classname Demo113
 * @Description TODO
 * @Date 2020/4/2 10:49
 * @Created by Administrator
 */
public class Demo113 {




    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root==null) return res;
        LinkedList<Integer> in = new LinkedList<>();
        in.add(root.val);
        backTrack(root,root.val,sum,in);
        return res;
    }
    public void backTrack(TreeNode root,int curSum,int sum,LinkedList<Integer> list){
        if(root.left==null&&root.right==null){ //叶子节点
            if(curSum==sum){
                res.add(new LinkedList<>(list));
            }
            return ;
        }
        if(root.left!=null){
            list.add(root.left.val);
            backTrack(root.left,curSum+root.left.val,sum,list);
            list.removeLast();
        }
        if(root.right!=null){
            list.add(root.right.val);
            backTrack(root.right,curSum+root.right.val,sum,list);
            list.removeLast();
        }
    }


    // 应该要使用回溯法，加上限界函数的深度优先遍历,使用非递归的方法来深度优先遍历
    public List<List<Integer>> getTheList(TreeNode root,int sum){
        // 用来存储所有符合条件的list
        List<List<Integer>> reList = new ArrayList<>();
        List<Integer> curList = new ArrayList<>();
        // 使用迭代的方法来深度优先遍历二叉树
        Stack<TreeNode> stack = new Stack();
        if(root!=null) stack.add(root);
        // dfs的前序遍历
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            curList.add(node.val);
            int temp = curList.stream().mapToInt(Integer::intValue).sum();
            // 判断当前节点是否是叶子节点
            if(node.left == null && node.right == null){
                if(temp == sum) {
                    List<Integer> tempList = new ArrayList<>();
                    Collections.copy(tempList,curList);
                    reList.add(tempList);
                    while(reList.size()>1) reList.remove(reList.size()-1);
                }
                else{//不满足条件，开始回溯
                    curList.remove(curList.size()-1);
                }
            }else{
                if(temp<sum){// 可以继续向下面遍历
                    if(node.right != null) stack.add(node.right);
                    curList.remove(curList.size()-1);
                    if(node.left != null) stack.add(node.left);

                }else{//不满足条件开始回溯
                    curList.remove(curList.size() - 1);
                }
            }
        }
        return reList;
    }



    public static void main(String[] args) {

    }
}
