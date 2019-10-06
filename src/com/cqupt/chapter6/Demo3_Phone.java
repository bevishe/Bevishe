package com.cqupt.chapter6;

public class Demo3_Phone {

    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "苹果";
        p.color = "黑色";
        p.price = 8888;

        p.call("Jack");
        p.sendMessage();
    }
}
