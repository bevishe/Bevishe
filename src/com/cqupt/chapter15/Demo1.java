package com.cqupt.chapter15;


public class Demo1 {
    /*
    内部类：一个类内部包含一个类
    例如：身体和心脏的关系 汽车和发动的关系
    * */
    public static void main(String[] args) {
        Body body = new Body("bbb");   //外部类的对象
        body.methodBodyHeart();   //通过外部类的对象调用外部的成员方法，在方法里面间接地使用内部类

        Body.Heart heart = new Body("aaa").new Heart();
        heart.methodHeart();
    }
}
