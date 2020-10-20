package com.leetcode.interview;

import java.util.Scanner;

public class Demo_sc1 {


    public static void method(String string,int k){
        string.toLowerCase();
        int len = 0;
        int left=0,right=0;
        int sum = string.charAt(0) - 'a' + 1;
        while(left<=right && right<string.length()){
            if(sum == k){
                len = Math.max(right - left + 1,len);
            }
            if(sum >= k){
                    if(left < right) {
                        left ++;
                        sum -= (string.charAt(left) - 'a' + 1);
                    }

            }else{

                    right ++;
                    if(right >= string.length()) {
                        System.out.println(len);
                        return;
                    }
                    sum += (string.charAt(right) - 'a' + 1);
            }
        }
        System.out.println(len);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int k = Integer.parseInt(scanner.nextLine().trim());
        method(line,k);
    }
}
