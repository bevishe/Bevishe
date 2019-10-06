package com.cqupt.chapter5;

class Person{
    public void eat(Apple apple){
        Apple peeled = apple.getPeeled();
        System.out.println("yummy");
    }
}

class Apple{
    Apple getPeeled(){
        return Peeler.peel(this);
    }
}

class Peeler{
    static Apple peel(Apple apple){
        return apple;
    }

}

public class Demo2_this {
    //this 关键词的使用
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}
