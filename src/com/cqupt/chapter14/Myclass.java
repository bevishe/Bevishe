package com.cqupt.chapter14;

public class Myclass {


    private int num= 10;
    protected int num_protected = 10;
    int num_default = 10;
    public int num_public = 10;

    public void method(){
        System.out.println(num);
        System.out.println(num_protected);
        System.out.println(num_default);
        System.out.println(num_public);
    }
}
