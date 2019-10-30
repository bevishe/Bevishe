package com.cqupt.generic;

public class Demo3_GenericMethod {
    /*
    * 测试含有泛型的方法：
    * */



    public static void main(String[] args) {
        GenericMethod g = new GenericMethod();
        g.method("J12");
        g.method(1213);
        g.method(true);


        //调用含有泛型的静态成员方法
        GenericMethod.method2(1233);
        GenericMethod.method2("123");
        GenericMethod.method2(true);

    }



}
