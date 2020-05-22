package com.leetcode.swordOffer;

import java.util.ArrayList;

/**
 * @Classname Demo29
 * @Description TODO
 * @Date 2020/5/2 21:11
 * @Created by Administrator
 */
public class Demo29 {

    // 顺时针从外向里打印数字
    public int[] spiralOrder(int[][] matrix){
        ArrayList<Integer> arrayList = new ArrayList<>();
        int up = 0 , left = 0 ,down = matrix.length - 1,right = matrix[0].length - 1,curX = 0 ,curY = 0;
        while (true){
            // 从左到右
            for (;curY <= right;curY++) arrayList.add(matrix[curX][curY]);
            up ++;
            if(up > down) break;

            // 从上到下，
            curY--;
            curX++;
            for (;curX <= down;curX++) arrayList.add(matrix[curX][curY]);
            right --;
            if(right < left) break;

            // 从右到左
            curX--;
            curY--;
            for(;curY >= left;curY--) arrayList.add(matrix[curX][curY]);
            down --;
            if(down < up) break;

            // 从下到上
            curY++;
            curX--;
            for (;curX >= up;curX--) arrayList.add(matrix[curX][curY]);
            left ++;
            if(left > right) break;
            curX ++;
            curY++;
        }


        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {

    }
}
