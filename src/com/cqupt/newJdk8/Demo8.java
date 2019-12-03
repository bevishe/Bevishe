package com.cqupt.newJdk8;

import java.util.Arrays;
import java.util.Comparator;

public class Demo8 {

    /*
    * 如果一个函数的返回值是一个函数式接口，那么就可以直接返回一个Lambda表达式
    * 当需要通过一个方法来获取一个java.util.Comparator接口类型的对象作为排序器的时候，就可以调该方法获取
    * */

    // 只要是需要一函数时接口实现类的地方都可以使用匿名内部类或者是函数式编程来实现（Lambda表达式来实现）

    // 定义一个方法，方法的返回值使用函数式接口Comparator
    public static Comparator<String> getComparator(){

//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        };

        // 使用Lambda表达式来进行优化
        return (String o1,String o2) ->{
            return o1.length() - o2.length();
        };
    }


    public static void main(String[] args) {
        //调用上面的方法
        String[] arr = {"you hello","world"};
        for (String s : arr) {
            System.out.println(s);
        }

        Arrays.sort(arr,getComparator());
        for (String s : arr) {
            System.out.println(s);
        }


    }
}
