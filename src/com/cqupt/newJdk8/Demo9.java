package com.cqupt.newJdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo9 {



    /*
    * 使用传统的方法，遍历集合，对集合中的数据进行过滤
    *
    * */
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");


        // 对list集合中的元素进行过滤
        List<String> listB = new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("张")){
                listB.add(s);
            }
        }

        for (String s: listB) {
            System.out.println(s);

        }
    }

    //使用Stream流的方法是来对上面进行优化，Stream流是jdk1.8之后出现的
    //关注的是做什么，而不是怎么做

    public static void method(){
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");


        list.stream().filter(s -> s.startsWith("张")).filter(s->s.endsWith("忌")).forEach(name -> System.out.println(name));







    }
}
