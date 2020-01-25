package com.cqupt.stream;

import java.util.stream.Stream;

public class Demo2_Filter {



    public static void main(String[] args) {
        // filter方法进行过滤

        // 创建一个stream流对象
        Stream<String> stringStream = Stream.of("圆1","圆2","三角形1");
        // 对流中的数据进行过滤
        stringStream.filter(s -> s.startsWith("圆")).forEach(s -> System.out.println(s));

        // filter中的接口是如何实现的

    }
}
