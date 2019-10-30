package com.cqupt.apiClass;

public class Demo1 {

    /*
    * 包装类：
    * 基本数据类型，使用起来非常方便，但是没有对应的方法来操作这些基本类型的数据，
    * 可以使用一个类，把基本数据类型的数据装起来，在类中定义一些方法，这个类就叫做
    * 包装类，我们可以使用类中的方法来操作这些基本数据类型
    * */


    public static void main(String[] args) {
        Integer it = new Integer(123);
        System.out.println(it);
        Integer it2 = new Integer("123");
        System.out.println(it2);

        Integer it3 = Integer.valueOf(123);
        Integer it4 = Integer.valueOf("123");


        int i = it.intValue();
        System.out.println(i);
        int j = it.intValue();
    }
}
