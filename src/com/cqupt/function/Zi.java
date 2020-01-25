package com.cqupt.function;

public class Zi extends Fu{
    @Override
    public void sayHello(String s) {
        System.out.println("hello，this is zi");
        System.out.println(s.toUpperCase());
    }


    //定义方法参数传递Greetable接口
    public void method(Greetable greetable){
        greetable.greet();
    }

    public void show(){
        //调用method方法，
        method(()->{
            // 创建父类
            Fu fu = new Fu();
            fu.sayHello("我是show方法");
        });
    }

    public void show2(String s){
        method(()->{//()中的参数只和接口中的唯一一个抽象方法的参数有关，抽象方法中有参数，这个两个地方是一一相对的
            // 因为这个里面实现的是接口的实现类，也就是实现的函数式接口中的唯一一个抽象方法，方法外面的其他参数是请求函数的参数
            super.sayHello(s);
        });
    }

    //使用方法引用
    public void show3(String s){
        method(super::sayHello);
        System.out.println("show3");
    }

    public void showPlus(){
        Greetable greetable = new Greetable() {
            @Override
            public void greet() {
                System.out.println("使用内部类来实现的");
            }
        };

        method(greetable);
    }

    public void showPlusPlus(){
        method(new Greetable() {
            @Override
            public void greet() {
                System.out.println("使用匿名内部类来显示");
            }
        });
    }

    public static void main(String[] args) {
        new Zi().show();
        new Zi().showPlus();
        new Zi().showPlusPlus();
        new Zi().show3("使用方法引用的方法");
    }
}
