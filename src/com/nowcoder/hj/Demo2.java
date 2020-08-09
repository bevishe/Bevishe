package com.nowcoder.hj;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.Scanner;

public class Demo2 {


    public static int method(String str,char ch){
        String str1 = str.toUpperCase();
        char c = Character.toUpperCase(ch);
        int count = 0;
        for(int i = 0;i<str1.length();i++){
            if(str1.charAt(i) == c)
                count++;
        }
        return count;
    }

    public static void main(String[] args){


        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1,null);
        System.out.println(hashMap.size());


        Boolean flag = false;

        int a = 1;
        Integer b = 1;
        Integer c = new Integer(1);
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b==c);
    }
}
