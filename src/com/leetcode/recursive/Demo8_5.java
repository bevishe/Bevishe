package com.leetcode.recursive;

import java.util.ArrayList;
import java.util.List;

public class Demo8_5 {

    public Demo8_5() {
    }


    public int multiply(int A, int B) {
        if(A == 0 || B ==0) return 0;
        return recur(A,Integer.toBinaryString(B));
    }

    public int recur(int A,String bString){
        int temp = A;
        if(bString.equals("0")) return 0;
        else if(bString.equals("1")) return A;
        else{
            if(bString.charAt(0) == '0'){
                System.out.println(bString);
                String t = bString.substring(1,bString.length());
                return recur(A,t);
            }else{
                System.out.println(bString);
                String t = bString.substring(1,bString.length());
                System.out.println(temp<<(bString.length() - 1));
                return temp << (bString.length() - 1) + recur(A,t);
            }
        }
    }

    public static void main(String[] args) {
        Demo8_5 demo8_5 = new Demo8_5();
        System.out.println(demo8_5.multiply(10,6));
        List<Integer> arr = new ArrayList<>();
    }
}
