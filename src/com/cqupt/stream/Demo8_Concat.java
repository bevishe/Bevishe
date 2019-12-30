package com.cqupt.stream;

import java.util.stream.Stream;

public class Demo8_Concat {


    // 合并两个Stream流

    public static void main(String[] args) {
        Stream<String> stringStream1 = Stream.of("hello","test","see","word");
        Stream<String> stringStream2 = Stream.of("hello2","test2","see2","word2");
        Stream<String> concat = Stream.concat(stringStream1, stringStream2);
        //遍历Concat流
        concat.forEach(s -> System.out.println(s));

    }
}
