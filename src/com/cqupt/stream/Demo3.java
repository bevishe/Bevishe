package com.cqupt.stream;

import java.util.stream.Stream;

public class Demo3 {

    /*
    * Stream流属于管道流，只能被消费一次
    * 第一个Stream流调用完毕方法，数据就会流转到下一个Stream上，而这时第一个Stream流
    * 已经使用完毕，就会关闭，所以第一个Stream流就不能再调用方法
    *
    * */
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("hello","test");
        stringStream.forEach(s-> System.out.println(s));

    }
}
