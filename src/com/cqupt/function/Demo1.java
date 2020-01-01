package com.cqupt.function;

public class Demo1 {

    /*
    * 方法引用：
    *
    * */

    // 定义一个方法，参数传递Printable接口，对字符串进行打印
    public static void printString(Printable printable){
        printable.print("hello World");
    }
    public static void main(String[] args) {

        /*
        * 1.Lambda:s -> System.out.println(s);
        *           拿到参数经Lambda之手，传递给System.out.println()方法去处理
        * 2.方法引用：System.out::println
        *
        * */
        printString(s -> System.out.println(s));
        printString(System.out::println);
        /*
        * ：：引用运算符，而他所在的表达式被称为方法引用，如果Lambda要表达的函数方案已经存在于方法的实现中
        * 那么则可以通过双冒号来引用giant方法作为Lambda的替代者
        * */
    }

    /*
   * 继承extends是is-a关系
   * 接口interface是have-a关系
   * 问题：为什么要要把接口当做参数传递？这样做的好处体现在哪里？
   * 使用接口作为函数参数其实是起到了“请求”和“实现”分离开来，就是接口的解耦合功能。
   * 我们在printString中需要请求一个可以打印字符串的接口接口实现类，但是我们请求的是只需要打印字符串的功能就行，不用去关系
   * 具体要如何实现这个，同时我们可以根据传入不同的接口实现类，来实现不同形式的printString功能形式
   *
   *
   * Lambda表达式的目的，打印参数传递的字符串，
   * 把参数s，传递给System.out对象，调用out对象中的方法println对字符串进行了输出
   * 因为System.out对象是已经存在的，println方法也是已经存在的，所以可以使用方法引用来优化lambad表达式
   * 可以使用System.out方法直接引用调用println方法
   * */
}
