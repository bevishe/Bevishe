package com.leetcode.swordOffer;

import java.util.Stack;

/**
 * @Classname Demo9
 * @Description TODO
 * @Date 2020/2/16 11:00
 * @Created by Administrator
 */
public class Demo9 {
}

class CQueue{

    // 用两个栈来实现队列
    Stack<Integer> stackFirst;
    Stack<Integer> stackSecond;

    public CQueue(){
        stackFirst = new Stack<>();
        stackSecond = new Stack<>();


    }

    public void appendTail(int value){
        stackFirst.push(value);
    }

    public int deleteHead(){
        if(stackFirst.empty()) return -1;
        while(!stackFirst.empty()) stackSecond.push(stackFirst.pop());
        int re = stackSecond.pop();
        while(!stackSecond.empty()) stackFirst.push(stackSecond.pop());
        return re;
    }
}

