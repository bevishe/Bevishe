package com.cqupt.stream;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demo2_Consumer {

        // 使用jdk8中的新特性 consumer消费者接口，
        public static void printInfo(String[] strArr, Consumer<String> con1, Consumer<String> con2,Consumer<String> con3){

            for (int i = 0; i < strArr.length; i++) {
                con1.andThen(con2).accept(strArr[i]);
                con3.accept(strArr[i]);
            }
        }

        public static void main(String[] args) {
            String[] strArr = {"费哥哥,女","欢欢姐,女","娇娇妹,女"};
            printInfo(strArr,(message)->{
                System.out.print("姓名:" + message.split(",")[0] + "。  ");
            },(message)->{
                System.out.println("性别:" + message.split(",")[1] + "。");

            },name ->{
                System.out.println(name);
            });



            // 获取一个Stream流
            Stream<String> stringStream = Stream.of("张三","李四","王五");
            // 使用stream流中的方法forEach，对流中的数据进行遍历
            stringStream.forEach(s -> System.out.println("name:"+s));
        }

        /*
        * Consumer 消费性的函数式接口，可以传递lambda，消费数据
        *
        * foreach方法：用来遍历流中的数据，终结方法，遍历之后不能继续调用stream中的其他方法
        * */

}
