package com.leetcode.swordOffer;

import java.util.Stack;

/**
 * @Classname Demo31
 * @Description TODO
 * @Date 2020/5/4 20:35
 * @Created by Administrator
 */
public class Demo31 {


    // 栈的压入，弹出序列
    public boolean validateStackSequences(int[] pushed,int[] poped){
        Stack<Integer> stack = new Stack<>();
        int curPush = 0,curPop = 0;
        while(curPop < poped.length){
            // 输入序列压栈
            /*
            * 1.栈不为空的时候，栈顶不等于当前未知的pop
            * 2.栈空的时候，curPush 《 push数组的长度
            * */
            while(curPush < pushed.length && (!stack.isEmpty() || (int)stack.peek() != poped[curPop])){
                stack.push(pushed[curPush]);
                curPush++;
            }

            if(stack.isEmpty()) return true;
            else if((int)stack.peek() == poped[curPop]){
                stack.pop();
                curPop++;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
