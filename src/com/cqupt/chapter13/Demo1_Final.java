package com.cqupt.chapter13;

public class Demo1_Final {
    /*
    * final关键字代表最终，不可改变的
    *
    * 常见用法：
    * 1.修饰一个类：则不可以有子类
    * 2.修饰一个方法:则该方法为一个最终方法，不可以再进行覆盖重写
    * 3.修饰一个局部变量:一次赋值，终身不变(基本数据类型，引用数据类型)
    * 4.还可以修饰一个成员变量：
    * */

    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);

        num =20;
        System.out.println(num);

        final int num1 = 200;
        System.out.println(num1);
        //num1 = 20;
        //num1 = 200; 也是错误的

        // 这个是正确写法，保证一次赋值就好
        final int num3;
        num3 = 100;

        /*
        对于基本数据类型：不可变是变量当中的数据不可变
        对于引用数据类型：不可变是变量当中的地址值不可变，但是其中的内容是可以改变的
        */
        final Student s = new Student("aaa",12);
        //s = new Student(); 引用的地址发生了改变
        System.out.println(s.getName());
        s.setName("bbb");
        System.out.println(s.getName());


    }
}
