package com.cqupt.chapter10;


/*
抽象方法：加上abstract关键字，然后去掉大括号，直接分号结束
抽象类：抽象方法所在的类必须是抽象类，在class之前写上abstract


* */
public abstract class Animal {
    //抽象方法
    public abstract void eat();

    //普通方法
    public void normalMethod(){

    }
}
