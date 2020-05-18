package com.leetcode.swordOffer;

/**
 * @Classname demo4
 * @Description TODO
 * @Date 2020/2/14 12:49
 * @Created by Administrator
 */
public class demo4 {

    //暴力解决
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        int n = matrix.length,m;
        if(n!=0)  m = matrix[0].length;
        else return false;
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++)
                if(matrix[i][j]==target) return true;
        }
        return false;
    }

    // 把矩阵看成是一个二叉搜索树，第一行的最后一个数是根
    public static boolean findNumberIn2DArrayPlus(int[][] matrix,int target){
        int n = matrix.length,m,rN,rM;
        if(n!=0) m = matrix[0].length;
        else return false;


        rN = 0;
        rM = m-1;
        if(rN>=n||rM<0) return false;
        int root = matrix[rN][rM];
        while(true){
            if(rN>=n||rM<0) return false;
            if(root<target) rN++;
            else if(root>target) rM--;
            else return true;
            root = matrix[rN][rM];
        }


    }


    public static void main(String[] args) {
        int[][] a = {{}};
        System.out.println(findNumberIn2DArrayPlus(a,1));
    }
}
