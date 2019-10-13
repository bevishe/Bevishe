package com.cqupt.chapter10;

public class Demo1 {
    //抽象类
    //父类：图形
    //计算面积的方法   （抽象方法）
    //子类：正方形，三角形，圆形
    public static void main(String[] args) {
        Cat cat = new CatGod();
        cat.eat();
        cat.sleep();
    }


}
