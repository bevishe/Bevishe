package com.cqupt.stream;

import java.util.stream.Stream;

public class Demo6_Limit {
    /*
    * Stream中的limit方法是一个延迟方法，只是对流中的元素进行截取，返回的是一个新的流，所以可以继续调用Stream流中的其他方法
    *
    * */


    public static void main(String[] args) {
        // 获取一个Stream流
        Stream<String> stringStream = Stream.of("你","我","他","她");
        Stream<String> newStream = stringStream.limit(2);
        //遍历newSteam流
        newStream.forEach(s -> System.out.println(s));
    }
}

