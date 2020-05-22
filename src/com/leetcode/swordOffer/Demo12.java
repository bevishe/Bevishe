package com.leetcode.swordOffer;

import java.util.Stack;

/**
 * @Classname Demo12
 * @Description TODO
 * @Date 2020/2/18 18:41
 * @Created by Administrator
 */

public class Demo12 {


    // 矩阵中的路径


    public static boolean exist(char[][] board,String word){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == word.charAt(0)){
                    Stack<int[]> stack = new Stack<>();
                    int[][] indexState = new int[board.length][board[0].length];
                    int wordIndex = 0;
                    indexState[i][j] = 1;
                    stack.push(new int[]{i,j});
                    wordIndex ++;
                    int x = i,y=j;
                    // 从第一个符合word单词第一个字的位置向周边搜索
                    while(true){
                        if(wordIndex == word.length()) return true;
                        else if(isRight(board,indexState,x-1,y,word.charAt(wordIndex))){
                            x--;
                            stack.push(new int[]{x,y});
                        } else if(isRight(board,indexState,x,y-1,word.charAt(wordIndex))){
                            y--;
                            stack.push(new int[]{x,y});
                        } else if(isRight(board,indexState,x+1,y,word.charAt(wordIndex))){
                            x++;
                            stack.push(new int[]{x,y});
                        } else if(isRight(board,indexState,x,y+1,word.charAt(wordIndex))){
                            y++;
                            stack.push(new int[]{x,y});
                        } else {
                            int[] tempArray = stack.pop();
                            x = tempArray[0];
                            y = tempArray[1];
//                            indexState[][] a = new  null;
                        }
                        wordIndex++;
                    }

                }
            }
        }

        return false;
    }

    public static boolean isRight(char[][] board,int[][] indexState,int x,int y,char target){
        if(x>=0 && x <board.length && y >=0 && y < board[0].length && indexState[x][y] != 1 && indexState[x][y] != -1 && board[x][y] == target)
            return true;
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        exist(board,"ABCCED");
    }
}
