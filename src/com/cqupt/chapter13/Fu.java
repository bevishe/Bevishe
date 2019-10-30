package com.cqupt.chapter13;

public class Fu {

    //注意事项：对于类和方法来说，abstract关键字和final关键字不能同时使用

    public void method(){
        System.out.println("父类方法执行！");
    }

    public final void methodFinal(){
        System.out.println("父类中的final成员方法！");
    }
}
