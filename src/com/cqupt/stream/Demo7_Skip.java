package com.cqupt.stream;

import java.util.stream.Stream;

public class Demo7_Skip {


    /*
    *
    * skip：跳过前n个元素，返回一新的流对象
    * */

    public static void main(String[] args) {
        //获取一个Stream
        Stream<String> stringStream = Stream.of("Ni","wo","hello","test","see");
        Stream<String> skip = stringStream.skip(3);
        // 遍历skip
        skip.forEach(s -> System.out.println(s));
    }
}
