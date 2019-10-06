package com.cqupt.chapter5;

public class Demo1_method {

    /**
    函数的误区：

     函数的重载：
     1.在同一个类中允许存在一个以上同名的函数，只要他们的参数个数不同，或者参数类型不同就可以
     2.与返回值类型无关只看参数列表
     3.好处是方便阅读，优化了程序设计


     类名：
     首字母大写
     方法名：
     首字母小写

    */
    private static void printHello(){
        System.out.println("hello");
    }

    private static void printHello(String name){
        System.out.println("hello" + name);
    }

    void f1(byte x){
        System.out.println("byte"+x);
    }
    void f1(char x){
        System.out.println("char"+x);
    }
    void f1 ( int x){
        System.out.println("int" + x);
    }
    void f1(long x){
        System.out.println("long"+x);
    }
    void f1(float x){
        System.out.println("float"+x);
    }
    void f1(double x){
        System.out.println("double"+x);
    }

    void testVal(){
        f1(5);
        f1(5);
        f1(5);
        f1(5);
        f1(5);
    }

    public static void main(String[] args) {
        printHello();
        printHello("bevishe");
        Demo1_method d = new Demo1_method();
        d.testVal();


        //方法的重

    }

}

class Test{

    public static void main(String[] args) {

    }
}