package com.leetcode.swordOffer;

import java.util.LinkedList;

/**
 * @Classname Demo59
 * @Description TODO
 * @Date 2020/4/8 15:01
 * @Created by Administrator
 */
public class Demo59 {


    public static void main(String[] args) {

    }
}

// 要求是函数的均摊时间复杂度都是O（1）
class MaxQueue{
    private LinkedList queue;
    public MaxQueue(){
        this.queue = new LinkedList();
    }

    public int max_value(){
        if(queue == null) return -1;
        int max = queue.indexOf(0);
        for (int i = 0; i < queue.size(); i++) {
            max = max > (int)queue.get(i) ? max : (int)queue.get(i);
        }
        return max;
    }

    public void push_back(int value){
        this.queue.add(value);
    }

    public int pop_front(){
        if(this.queue.size() == 0) return -1;
        else return (int) this.queue.pop();
    }
}
