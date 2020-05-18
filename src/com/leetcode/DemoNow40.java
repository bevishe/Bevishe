package com.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class DemoNow40 {

    public int[] getLeastNumbers(int[] arr,int k){
        if(k == 0) return new int[0];
        PriorityQueue<Integer> bigHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1-o2);
            }
        });
        if(arr.length <= k) return arr;
        else{
            int curSize = 0;
            for (int num : arr) {
                if(bigHeap.size() < k){
                    bigHeap.add(num);
                }else{
                    if(num < bigHeap.peek()){
                        bigHeap.poll();
                        bigHeap.add(num);
                    }
                }
            }
            return bigHeap.stream().mapToInt(Integer::valueOf).toArray();
        }
    }

    public static void main(String[] args) {

    }
}
