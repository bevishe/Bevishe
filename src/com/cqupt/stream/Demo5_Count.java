package com.cqupt.stream;

import java.util.stream.Stream;

public class Demo5_Count {


    // 类似Collection集合中的size（）方法一样，统计个数
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("1","2","3","4");
        Long countOfStream = stringStream.count();
        System.out.println(countOfStream);

        // 会报错：stream has already been operated upon or closed  说明count方法是一个终结方法
        stringStream.forEach(s -> System.out.println(s));
    }
}
