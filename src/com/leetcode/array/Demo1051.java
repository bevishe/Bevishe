package com.leetcode.array;

import java.util.Arrays;

public class Demo1051 {

    public int heightChecker(int[] heights){
        int re =0;
        if(heights == null || heights.length ==0 || heights.length == 1) return re;
        int l = heights.length;
        int[] oldHeights = new int[l];
        for (int i = 0; i < l; i++) {
            oldHeights[i] = heights[i];
        }

        Arrays.sort(heights);
        for (int i = 0; i < l; i++) {
            if(heights[i] != oldHeights[i])
                re ++;
        }


        return re;
    }

    public static void main(String[] args) {

    }
}
