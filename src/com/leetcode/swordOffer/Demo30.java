package com.leetcode.swordOffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Classname Demo30
 * @Description TODO
 * @Date 2020/5/4 19:47
 * @Created by Administrator
 */
public class Demo30 {



    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(3);
        minStack.push(-1);
        minStack.push(-1);
        minStack.pop();
        System.out.println(minStack.min());
    minStack.pop();
        System.out.println(minStack.min());
    minStack.pop();
        System.out.println(minStack.min());
    minStack.pop();
        System.out.println(minStack.min());
    }
}

class MinStack {

    /** initialize your data structure here. */
    public Stack<Integer> stack;
    public Stack<Integer> exStack;
    public MinStack() {
        this.stack = new Stack();
        this.exStack = new Stack();
    }

    public void push(int x) {
        this.stack.add(x);
        if(this.stack.size() == 1) this.exStack.push(x);
        else{
            int m = this.exStack.peek();
            if(x <= m) this.exStack.push(x);
        }
    }

    public void pop() {
        if((int)this.stack.peek() == (int)this.exStack.peek())
            this.exStack.pop();
        this.stack.pop();
    }

    public int top() {
        return this.stack.peek();
    }

    public int min() {
        if(this.exStack.size() == 0) return -1;
        int re = this.exStack.peek();
        return  re;
    }
}