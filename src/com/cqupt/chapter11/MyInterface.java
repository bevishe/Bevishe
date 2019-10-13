package com.cqupt.chapter11;

/*
* 在任何版本的java中，接口都可以定义抽象方法
* 注意事项：
* 1接口当中的抽象方法修饰符必须是两个固定1关键字，public abstract，不写默认的添加
* 2.这两个关键字可以选择省略
* 3.方法的三要素可以随意定义
* */

public interface MyInterface {
    public abstract void methodAbs();

    void methodTest();
}
