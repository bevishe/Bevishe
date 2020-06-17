package com.leetcode.recursive;

import java.util.ArrayList;
import java.util.List;

public class Demo8_5 {


    public int multiply(int A, int B) {
        if(A == 0 || B ==0) return 0;
        return recur(A,Integer.toBinaryString(B));
    }

    public int recur(int A,String bString){
        if(bString == "0") return 0;
        else if(bString == "1") return A;
        else{
            if(bString.charAt(0) == '0') return A + recur(A,bString.substring(1,bString.length()));
            else return A << bString.length() + recur(A,bString.substring(1,bString.length()));
        }

    }

    public static void main(String[] args) {
        Demo8_5 demo8_5 = new Demo8_5();
        System.out.println(demo8_5.multiply(3,4));
        List<Integer> arr = new ArrayList<>();
    }
}
