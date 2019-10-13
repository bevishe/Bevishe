package com.cqupt.chapter9;

public class Zi extends Fu {
    int numzi = 20;
    int num = 200;

    public void methodZi(){
        System.out.println(num);
    }

    public void mehtod(){
        int num = 300;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }

    @Override
    public String methodC() {
        System.out.println("子类重名方法");
        return null;
    }
}
