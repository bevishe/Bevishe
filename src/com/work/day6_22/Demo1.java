package com.work.day6_22;

import java.util.Scanner;

public class Demo1 {



    // 洗牌程序
    public int[] soulution(int cur,int k,int[] arr){
        if(cur == k+1) return arr;
        int leftLength = arr.length /2 ,rightLength = arr.length / 2;

        leftLength = arr.length % 2 == 0 ? leftLength : leftLength +1;
        int[] left = new int[leftLength],right = new int[rightLength];
        for (int i = 0; i < leftLength; i++) {
            left[i] = arr[i];
        }
        for (int i = 0; i < rightLength; i++) {
            right[i] = arr[leftLength+i];
        }
        int curLeftInd = leftLength -1,curRightInd = rightLength - 1,curCount = 0;
        if(cur % 2 == 0){//为偶数
            // 从左手的开始放，从left开始放元素
            for (int i = arr.length -1; i >= 0;i--) {
                if(curCount % 2 == 0){
                    arr[i] = left[curLeftInd--];
                }else{
                    arr[i] = right[curRightInd--];
                }
                curCount ++;
            }
        }else{// 为奇
            // 从右手开始放
            for (int i = arr.length -1;i>=0; ) {
                if(i ==0 && arr.length % 2 == 1){
                    arr[i] = left[curLeftInd --];
                    i--;
                    curCount ++;
                    break;
                }
                if(curCount%2 == 0){
                    arr[i] = right[curRightInd --];
                    i--;
                }else{
                    arr[i] = left[curLeftInd --];
                    i--;
                }
                curCount++;
            }
        }
        return soulution(cur+1,k,arr);
    }


    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int[] re = demo1.soulution(1,2,arr);
        for (int i : re) {
            System.out.println(i);
        }
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().trim().split(" +");
        int num = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int[] arr1 = new int[num];
        for (int i = 0; i < num; i++) {
            arr1[i] = Integer.parseInt(input[2+i]);
        }


    }
}
