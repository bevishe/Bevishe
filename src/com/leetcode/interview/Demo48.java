package com.leetcode.interview;

public class Demo48 {

    public void solution(int[][] matrix,int i){
        // 将第i层的外围以此变换

        int len = matrix.length;
        int[] tempArr = new int[len];
        int changeLen = len - 2*i -1;
        // tempArr 存储应该是右边的数组

        // 1.先将右边复制给tempArr，将右边和上边进行交换
        for (int j = 0; j < len; j++)  {
            tempArr[j] = matrix[j][len-1-i];
        }

        for (int j = i; j < i + changeLen; j++) {
            matrix[j][len - 1 - i] = matrix[i][j];
        }

        for (int j = 0; j < i+changeLen; j++) {
            matrix[i][j] = tempArr[j];
        }

//         2.上面和下面交换
        for (int j = 0; j < len - 2*i; j++) {
            tempArr[j] = matrix[len-1-2*i][j];
        }
        for (int j = i; j <i+changeLen; j++) {
            matrix[len - 1 -2*i][len-1-j] = matrix[i][j];
        }
        for (int j = i; j < i+changeLen; j++) {
            matrix[i][j] = tempArr[len - 1 - j];
        }

        // 3.上面和左边交换
        for (int j = 0; j < len - 2*i; j++) {
            tempArr[j] = matrix[j][i];
        }
        for (int j = i; j < i+changeLen; j++) {
            matrix[len-1-j][i] = matrix[i][j];
        }
        for (int j = i; j < i+changeLen; j++) {
            matrix[i][j] = tempArr[len - 1- j];
        }

    }

    public void rotate(int[][] matrix){
        int m = matrix.length / 2;
        for (int i = 0; i < m; i++) {
            solution(matrix,i);
        }
    }


    public static void main(String[] args) {
        Demo48 demo48 = new Demo48();
        int[][] testArr = new int[][]{
                                {5,1,9,11},
                                {2,4,8,10},
                                {13,3,6,7},
                                {15,14,12,16}
        };
//        int[][] testArr = new int[][]{
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };

        demo48.rotate(testArr);
        for (int i = 0; i < testArr.length; i++) {
            for (int j = 0; j < testArr.length; j++) {
                System.out.print(testArr[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
