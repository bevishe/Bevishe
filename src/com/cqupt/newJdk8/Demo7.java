package com.cqupt.newJdk8;

import java.util.function.Supplier;

public class Demo7 {

    /*
    * 常用的函数式接口：
    * java.util.function.Supplier<T> 接口包含一个无参数的方法，T get() 用来获取一个泛型参数指定类型的对象数据
    *
    * Supplier<T> 接口被称之为生产型接口，指定接口的类型是什么类型，那么接口中的get方法就会生产什么类型的数据
    *
    * */

    // 定义一个方法，方法的参数传递Supplier<T> 接口，泛型是String，所以可以传递Lambda表达式

    public static String GetString(Supplier<String> supplier){
        return supplier.get();
    }

    public static void main(String[] args) {
        String s = GetString(new Supplier<String>() {
            @Override
            public String get() {
                return "胡歌";
            }
        });
        System.out.println(s);

        String s2 = GetString(()->{return "胡歌";});
        System.out.println(s2);
    }
}

