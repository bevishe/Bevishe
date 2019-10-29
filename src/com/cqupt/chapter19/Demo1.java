package com.cqupt.chapter19;

public class Demo1 {

    /*
    * 可变参数：
    * 使用前提：
    * 当方法的参数列表数据类型已经确定，但是参数的个数不确定，就可以使用可变参数
    * 格式：
    *       修饰符  返回值类型  方法名 （数据类型。。。变量名）{}
    * 可变参数的原理：
    *       可以变参数底层就是一个数组，根据传递参数的个数不同，会创建不同长度的数组，来存储这些参数
    *       传递的参数个数可以是0-n
    *
    * 可变参数的注意事项：
    * 1.一个方法的参数列表，只能有一个可变参数
    * 2.如果方法的参数有多个，那么可变参数必须写在参数列表的末尾
    *
    * 可变参数的终结写法
    * public void method（Object... obj）{}
    * */

    public static void main(String[] args) {
        System.out.println(add(1,2,3,4,5));
    }

    private static int add(int ...num){
        System.out.println(num.toString());//底层是一个数组
        System.out.println(num.length);
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        return sum;
    }
}