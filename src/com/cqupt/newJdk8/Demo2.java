package com.cqupt.newJdk8;


// 函数式接口的使用
public class Demo2 {

    //定义一个方法，他的参数是函数式接口
    public static void show(MyFunctionInterface myFunctionInterface){
        myFunctionInterface.method();
    }

    public static void main(String[] args) {

        // 调用show方法，使用匿名内部类
        show(new MyFunctionInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类实现接口中的方法");
            }
        });

        // 调用show方法，使用lambda实现的接口中的函数
        show(()->
            System.out.println("使用lambda实现的接口中的抽象方法")
        );
    }

}
