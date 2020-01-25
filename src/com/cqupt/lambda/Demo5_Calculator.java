package com.cqupt.lambda;

public class Demo5_Calculator {

    public static void main(String[] args) {
        method(1,2,(a,b)->{
            return a+b;
        });
    }

    public static void method(int a,int b,Calculator calculator){
        int c;
        c = calculator.calcu(a,b);
        System.out.println(c);
    }
}