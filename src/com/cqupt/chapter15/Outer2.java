package com.cqupt.chapter15;

public class Outer2 {

    public void method(){
        int num = 10;
        class Inner{
            public void methodInner(){
                System.out.println(num);
            }
        }

        Inner i = new Inner();
        i.methodInner();
    }
}
