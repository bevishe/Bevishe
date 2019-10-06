package com.cqupt.chapter6;

/*
定义一个类，用来模拟手机
属性：
行为：
* */

public class Phone {
    String brand;
    double price;
    String color;

    public void call(String who){
        System.out.println("给"+who+"打电话");
    }

    public void sendMessage(){
        System.out.println("群发短信！");
    }


}
