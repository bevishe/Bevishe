package com.cqupt.chapter13;


/*
* 对于成员变量来说，如果使用final关键字修饰，那么这个变量也照样是不可变的
*
* 1.对于成员变量具有默认值，所有用了final关键字之后必须进行手动赋值，不会再给默认值
* 2.对于final的成员变量，那么使用使用直接赋值，要么通过构造方法赋值，二者选其一
* 3.使用构造方法赋值的时候，必须保证所有的构造方法都可以对final关键字修饰的成员变量进行赋值
* */


public class Person {
    //private final String name = "aaa";
    private final String name;

    public Person() {
        name = "bbb";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
