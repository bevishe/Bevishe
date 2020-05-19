package com.leetcode.swordOffer;

import java.util.ArrayList;

/**
 * @Classname Demo17
 * @Description TODO
 * @Date 2020/3/15 21:54
 * @Created by Administrator
 */
public class Demo17 {


    public static int[] printNumbers(int n){
        int max = 0;
        for(int i = 0; i< n;i++){
            max += 9 * Math.pow(10,i);
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            arrayList.add(i);
        }

        int[] res = new int[arrayList.size()];
        res = arrayList.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Math.pow(2,3));
        for (int i = 0; i < printNumbers(4).length ; i++) {
            System.out.println(printNumbers(4)[i]);
        }
    }
}
