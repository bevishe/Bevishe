package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Demo22 {
    /*
    *
    * 给定n生成n个括号所有有效的排列组合
    *
    *
    * */

    public static void main(String[] args) {

    }


    /*
    * 该题可以使用回溯法来解决，遍历二叉树，对不符合要求的进行剪枝操作，满足条件的节点用集合来接收
    * */
    public List<String> generateParenthesis(int n){
        // 1.创建一个ArrayList集合对象
        ArrayList<String> arrayList = new ArrayList<>();

        //2.当树的深度达到了2n停止，或者是左括号小于有括号的数量，每次都从右边添加括号
        int deep = 0;
        while(deep<2*n){

        }

        return arrayList;
    }
}
