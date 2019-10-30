package com.cqupt.chapter14;

public class AnotherClass {

    public void method(){
        System.out.println(new Myclass().num_public);
        System.out.println(new Myclass().num_default);
        System.out.println(new Myclass().num_protected);
        //System.out.println(new Myclass().num); 访问不了
    }
}
