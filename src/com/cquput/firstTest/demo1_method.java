package com.cquput.firstTest;

public class demo1_method {

    /**
    函数的误区：

     函数的重载：
     1.在同一个类中允许存在一个以上同名的函数，只要他们的参数个数不同，或者参数类型不同就可以
     2.与返回值类型无关只看参数列表
     3.好处是方便阅读，优化了程序设计

    */
    private static void printHello(){
        System.out.println("hello");
    }

    private static void printHello(String name){
        System.out.println("hello" + name);
    }

    public static void main(String[] args) {
        printHello();
        printHello("bevishe");

    }
}
