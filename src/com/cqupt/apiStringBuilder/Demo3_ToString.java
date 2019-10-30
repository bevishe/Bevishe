package com.cqupt.apiStringBuilder;

public class Demo3_ToString {
    //StringBuilder和String之间可以相互转换
    /*
    * String -> StringBuilder 可以使用StringBuilder的构造方法
    * StringBuilder -> String 可以使用StringBuilder中的toString方法
    * */


    public static void main(String[] args) {
        String a = "hello";
        StringBuilder ab = new StringBuilder(a);
        System.out.println(ab);

        String s = ab.toString();
        System.out.println(s);
    }

}
