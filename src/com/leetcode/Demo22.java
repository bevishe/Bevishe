package com.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo22 {
    // 设置数组的大小
    private static final int N = 6;
    private static char[] sArray = {'(',')'};

    /*
    *
    * 给定n生成n个括号所有有效的排列组合
    *
    *
    * */

    public static void main(String[] args) {
        // 1.创建一个ArrayList集合对象,和放括号的char数组
        ArrayList<String> arrayList = new ArrayList<>();
        char[] s =new char[N];

        putS(0,s,arrayList);

        // 对arrayList进行遍历
        for (String s1 : arrayList) {
            System.out.println(s1);
        }
    }


    /*
    * 该题可以使用回溯法来解决，遍历二叉树，对不符合要求的进行剪枝操作，满足条件的节点用集合来接收
    * 同时满足的是排列树
    *
    * */

    //
    private static void putS(int index,char[] s,ArrayList<String> arrayList){
        // 表明数组中已经满足条件放满了，将该char【】转成字符串存储到arraylist中去
        if(index==N){
            arrayList.add(new String(s,0,N));
            System.out.println(new String(s,0,N));
        }else{
            //遍历
            for (int i = 0; i < 2; i++) {
                if(isRight(index,sArray[i],s)){
                    s[index] = sArray[i];
                    putS(index+1,s,arrayList);
                    s[index] = ' ';
                }
            }

        }
    }

    private static boolean isRight(int index,char index_s,char[] s){
        int left = 0,right = 0;

        for (char c : s) {
            if(c=='(') left+=1;
            else if(c==')') right += 1;
        }
        // 当前char数组中左括号的数量小于右括号的数量判错
        // 当前存储左括号的数量大于三个判错
        if(left>3 || left<right) return false;
        // 当做括弧等于3个，index=0时判错
        if(index==N-1 && index_s == '(') return false;
        return true;
    }
}
