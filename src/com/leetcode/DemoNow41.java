package com.leetcode;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoNow41 {



    public static void main(String[] args) {

    }
}

class MedianFinder{


    private Queue<Integer> bigHeap,smallHeap;
    public MedianFinder(){
        bigHeap = new PriorityQueue<>((x,y) -> {return y-x;});
        smallHeap = new PriorityQueue<>();
    }


    public void addNum(int num){
        if(bigHeap.size() == smallHeap.size()){
            smallHeap.add(num);
            int temp = smallHeap.poll();
            bigHeap.add(temp);
        }else{
            bigHeap.add(num);
            int temp = bigHeap.poll();
            smallHeap.add(temp);
        }
    }



    public double findMedian(){
        if(bigHeap.size() == smallHeap.size()){
            return (double)(bigHeap.peek() + smallHeap.peek())/2.0;
        }else{
            return (double)bigHeap.peek();
        }
    }
}