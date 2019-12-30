package com.cqupt.stream;

import java.util.stream.Stream;

public class Demo4_Map {

    /*
    * 映射：map
    * 如果需要将流中的元素映射到另外一个流中，可以使用map方法
    * <R> Stream<R> map(Function<? super T,? extends R> mapper)
    * */

    public static void main(String[] args) {
        // 获取一个String类型的Stream流
        Stream<String> stringStream = Stream.of("1","2","3");
        // 使用map方法将String类型的Stream转换成Integer类型的Stream
        Stream<Integer> integerStream = stringStream.map((String s) -> {
            return Integer.valueOf(s);
        });
        //遍历integerStream流
        integerStream.forEach(integer -> System.out.println(integer));
    }
}
