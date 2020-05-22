package com.leetcode.swordOffer;

import com.sun.xml.internal.ws.util.xml.CDATA;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Classname Demo37
 * @Description TODO
 * @Date 2020/5/13 10:26
 * @Created by Administrator
 */
public class Demo37 {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<Integer> reList = new ArrayList<>();

        // 使用先序优先遍历的方法
        ArrayList<TreeNode> queue = new ArrayList<>();
        if (root == null) return "[]";
        else{
            StringBuilder reString = new StringBuilder("[");
            queue.add(root);
            while(queue.size() != 0){
                TreeNode cur = queue.remove(0);
                if(cur!= null) {
                    reString.append(cur.val);

                    if(cur.left == null) queue.add(null);
                    else queue.add(cur.left);

                    if(cur.right == null) queue.add(null);
                    else queue.add(cur.right);
                }
                else reString.append("null");
                reString.append(',');
            }
            reString.replace(reString.length()-1,reString.length() -1,"]");
            return reString.toString();
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.substring(1,data.length()-1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        ArrayList<TreeNode> queue = new ArrayList<>();
        int curIndex = 1;
        queue.add(root);
        while(queue.size() != 0){
            TreeNode curNode = queue.remove(0);
            if(curNode != null){
                curNode.left = arr[curIndex].equals("null") ? null : new TreeNode(Integer.parseInt(arr[curIndex]));
                curIndex++;
                curNode.right = arr[curIndex].equals("null") ? null : new TreeNode(Integer.parseInt(arr[curIndex]));
                curIndex++;

                queue.add(curNode.left);
                queue.add(curNode.right);
            }
        }
        return root;
    }

    public static void main(String[] args) {

    }

}
