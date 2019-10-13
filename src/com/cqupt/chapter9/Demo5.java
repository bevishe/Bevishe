package com.cqupt.chapter9;

public class Demo5 {

    /*
    *继承关系中构造方法的特点：
    * 1.子类构造方法当中有一个隐含的super（），所以一定是先调用父类构造方法
    * 2.可以通过super关键字，来调用父类重载构造
    * 3.super的父类构造调用，必须是在子类构造犯法的第一个语句
    *
    * 子类必须调用父类构造方法，不写则赠送一个super（），写了则用写的指定的super调用，super只能有一次，还必须是一次
    * */

    public static void main(String[] args) {
        Zi1 z = new Zi1();

    }
}
