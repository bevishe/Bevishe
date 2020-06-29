package com.leetcode;

import java.util.*;

public class DemoNow43_1 {

    public int countDigitOne(int n){


        return 1;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer>  q = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        q.add(-1);
        q.add(0);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }




    }
}
