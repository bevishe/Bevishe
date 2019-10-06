package com.cqupt.chapter5;

public class Test8 {
    //
    void f1(){
        System.out.println("this is f1");
        f2();
        this.f2();
    }


    void f2(){
        System.out.println("this is f2");
    }


    public static void main(String[] args) {
        Test8 t = new Test8();
        t.f1();
    }
}
