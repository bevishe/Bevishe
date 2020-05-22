package com.leetcode.swordOffer;

import java.util.Stack;

/**
 * @Classname Demo13
 * @Description TODO
 * @Date 2020/2/19 20:00
 * @Created by Administrator
 */


public class Demo13 {
    private static int N = 0;

    // （0,0） -> (m-1,n-1)
    // 用来返回机器人可以达到的格子数量
    /*
    * 查看00坐标是否可以，若可以则可达数加一
    * 分别查看四个方向，若可以加一，否则遍历其他三个方向
    * 不用看四个方向，通过分析可达的一定需要从下，或者向右移动
    * */
    public static int movingCount(int m,int n,int k){
        // 状态矩阵用来记录某一个点是否已经检测可达，可达标为1，默认为零，不可达为-1
        int[][] state = new int[m][n];
        int num = 0; // 记录可达的数量

        // 定义初始的坐标x,y变量
        int x=0,y=0;
        Stack<int[]> stack = new Stack();
        stack.push(new int[]{x,y});

        while(!stack.empty()){
            int[] temp = stack.pop();
            x = temp[0];y = temp[1];
            // 判断pop出的坐标是否符合,不符合就不用看向前后左右移动
            if(state[x][y] != 1) {num++; state[x][y] = 1;}
            // 向下，如何合规就push
            if(x+1<m&&isOk(x+1,y,k)&&state[x+1][y]==0) stack.push(new int[]{x+1,y});

            // 向右，如果合规就push
            if(y+1<n&&isOk(x,y+1,k)&&state[x][y+1]==0) stack.push(new int[]{x,y+1});
        }

        return num;
    }


    // 判断（x,y）是否是合法的位置
    public static boolean isOk(int x,int y,int k){
        int sum = 0;
        while(x>=10){sum += x%10; x/=10;}
        while(y>=10){sum += y%10; y/=10;}

        return sum+x+y<=k?true:false;
    }

    public static void main(String[] args) {
        System.out.println(isOk(35,38,18));
        System.out.println(movingCount(36,11,15));
    }
}
