package com.cqupt.chapter5;

public class Demo3_Flower {
    int petalCount = 0;
    String s = "initial value";
    Demo3_Flower(int petals){
        petalCount = petals;
        System.out.println("Constructor w/ int arg only,petalCount="+petalCount);
    }

    Demo3_Flower(String ss){
        System.out.println("Constructor w/ int arg only,ss="+ss);
        s = ss;
    }

    Demo3_Flower(String s,int petals){
        this(petals);
//        this(s);
    }

}
