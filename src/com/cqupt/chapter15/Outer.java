package com.cqupt.chapter15;

public class Outer {
    public class Inner{
        int num = 20;

        public void method(){
            int num = 30;
            System.out.println(num);//局部变量
            System.out.println(this.num);//内部类的成员变量
            System.out.println(Outer.this.num); //外部类的成员变量
        }
    }

    int num = 10;
}
