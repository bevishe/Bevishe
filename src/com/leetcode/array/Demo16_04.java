package com.leetcode.array;

public class Demo16_04 {

    // 井字游戏
    public String tictactoe(String[] board) {
        // 没有玩家获胜且没有空位 Draw
        // 没有玩家获胜有空位 Pending
        // 赢了输出 X O
        int N = board.length;
        if(N == 0){
            return board[0].equals(" ") ? "Pending" : board[0];
        }else{
            String re = "Draw";
            int count = 0;
            // 转化为二维的字符数组
            char[][] arr = new char[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = board[i].charAt(j);
                    if(arr[i][j] == ' ') count ++;
                }
            }
            if(count > 0) re = "Pending";
            // 0,0 > 0,n-1，初始顶点在第一行
            for (int i = 0; i < N; i++) {
                int j = 1;
                for (; j < N; j++) {
                    if(arr[j][i] == ' ')break;
                    if(arr[j][i] != arr[0][i]) break;
                }
                if(j == N) {
                    re = String.valueOf(arr[0][i]);
                    return re;
                }
            }

            // 0,0 > n-1,0
            for (int i = 0; i < N; i++) {
                int j = 1;
                for (; j < N; j++) {
                    if(arr[i][j] == ' ' || arr[i][j] != arr[i][0]) break;
                }
                if(j == N){
                    re = String.valueOf(arr[i][0]);
                    return re;
                }

            }

            // 对角线
            if(arr[0][0] != ' '){
                int i = 0,j =0;
                while(i<N && arr[i][j] == arr[0][0]){
                    i++;j++;
                }
                if(i == N){
                    re = String.valueOf(arr[0][0]);
                    return re;
                }
            }

            //
            if(arr[0][N-1] != ' '){
                int i = 0,j=N-1;
                while(i<N && arr[i][j] == arr[0][N-1] ){
                    i++;j--;
                }
                if(i==N){
                    re = String.valueOf(arr[0][N-1]);
                    return re;
                }
            }
            return re;
        }
    }

    public static void main(String[] args) {

    }
}
