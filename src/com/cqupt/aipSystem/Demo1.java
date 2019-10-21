package com.cqupt.aipSystem;

import java.util.Date;

public class Demo1 {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(new Date(System.currentTimeMillis()));
        method();
        int[] a = {1,3,3,3,3,3,3};
        int[] array = method1(a);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }



    public static void method(){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println("hello");
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static int[] method1(int[] array){
        int[] newArray = {1,2,3,4,5};
        System.arraycopy(array,0,newArray,0,3);
        return newArray;
    }
}
