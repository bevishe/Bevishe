package com.dataStructure;

/**
 * @Classname MyCircularQueue
 * @Description TODO
 * @Date 2020/6/8 10:32
 * @Created by Administrator
 */
public class MyCircularQueue {

    /**
     * 设计一个循环链表
     * */
    private int[] circularQueue;
    private int startIndex,endIndex;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        this.circularQueue = new int[k];
        this.startIndex = 0;
        this.endIndex = 0;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        return (endIndex+1) % this.circularQueue.length == 0 ? true : false;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        return false;
    }

    /** Get the front item from the queue. */
    public int Front() {
        return -1;
    }

    /** Get the last item from the queue. */
    public int Rear() {
        return 0;
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return false;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return false;
    }

}
