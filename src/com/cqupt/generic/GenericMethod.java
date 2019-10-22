package com.cqupt.generic;

public class GenericMethod {
    // 定义含有泛型的方法
    /*
    * 定义在方法的修饰符和返回值类型之间
    * 修饰符 《泛型》 返回值类型 方法名（参数列表（使用泛型））{
    *
    * }
    * 含有泛型的方法在调用方法的时候确定泛型的数据类型，
    * 传递的什么类型的参数，泛型就是什么数据类型
    * */



    // 定义一个含有泛型的方法
    public <M> void method(M m){
        System.out.println(m);
    }


    //含有泛型的静态方法
    public static <M> void method2(M m){
        System.out.println(m);
    }

}
