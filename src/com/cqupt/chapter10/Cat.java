package com.cqupt.chapter10;

public abstract class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("猫吃鱼！");
    }

    public abstract void sleep();
}
