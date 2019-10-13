package com.cqupt.chapter8;

public class Demo1_Static {
    //static关键字
    //如果一个成员变量使用了static关键字，则该成员属性属于类，而不是对象



    public static void main(String[] args) {
        Student stu1 = new Student("郭靖",12);
        Student stu2 = new Student("黄蓉",12);
        stu1.classRoom = "helo";
        System.out.println(stu1.getName());
        System.out.println(stu2.getName());
        System.out.println(Student.classRoom);

    }
}
