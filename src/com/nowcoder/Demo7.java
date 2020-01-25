package com.nowcoder;

public class Demo7 {


    public static void main(String[] args) {
        Test1 test1 = new Test1();
    }
}

class Test1{
    {
        System.out.println("代码块");
    }

    public Test1(){
        System.out.println("构造方法");
    }

}