package com.cqupt.stream;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
import java.util.stream.Stream;

public class Demo1 {

    /*
    * 获取流：
    * 一般有两种方法用来获取流对象
    *
    * java.util.stream.Stream<T>

    * 1.所有的Collection集合都可以使用stream的默认方法获取一个流对象
    * 2.可以使用接口Stream的静态方法of获取数组对应的流对象
    * */

    public static void main(String[] args) {
        // 把集合转换成Stream流
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hello");
        arrayList.add("java");
        arrayList.add("test");
        Stream<String> stringStream = arrayList.stream();

        // 从集合中使用stream方法来获取流
        stringStream.filter(s -> s.startsWith("h")).forEach(s -> System.out.println(s));

        //set集合
        Set<String> hashSet = new HashSet<>();
        Stream<String> stream = hashSet.stream();

        Map<String,String> map = new HashMap<>();
        Stream<String> keySetStream = map.keySet().stream();

        // 获取键值对的关系entrySet
        Set<Map.Entry<String,String>> entrySet = new HashMap<String,String>().entrySet();
        Stream<Map.Entry<String,String>> entryStream = entrySet.stream();

        // 获取流对象的第二种方法，使用接口中的静态方法of从数组获取一个stream对象
        String[] arr = {"first","second","third"};
        Stream<String> arrStream = Stream.of(arr);
        long count = arrStream.count();
        System.out.println(count);
//        arrStream.forEach(s -> System.out.println(s));



        /*
        *
        * Stream流模型中的常用方法：
        * 延迟方法：
        * 返回值类型仍然是Stream接口自身类型的方法，因此支持链式调用。出了终结方法以外，其余方法均为延迟方法
        * 终结方法：
        * 返回值类型不是Stream接口自身的数据类型的时候，因此不再支持类似StringBuilder那样的链式调用。其中包括count和forEach方法就是终结方法
        * */
    }
}
