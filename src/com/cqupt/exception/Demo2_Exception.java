package com.cqupt.exception;

public class Demo2_Exception {

    /*
    *
    * 异常产生过程解析，分析异常是怎么产生的，如何处理异常
    *
    * jvm接收到了这个异常对象，做了两件事情：
    *   1.把异常对象 内容，原因，位置以红色的字体打印在控制台
    *   2.jvm会终止当前正在执行的java程序--》中断处理
    * */
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int ele = getEelement(arr, 4);
        /*
        * main方法接受到了这个异常对象，main方法也没有异常处理的处理逻辑，继续把异常抛出给main方法的调用者jvm处理
        * */
        System.out.println(ele);
    }

    public static int getEelement(int[] arr,int index){
        int ele = arr[index];
        /*
        * 访问了数组中的4索引，而数组没有4索引，这时候jvm就会检测出程序出现异常
        * jvm会做两件事：
        *   1.jvm会根据异常产生的原因创建一个异常对象，这个异常对象包含了异常产生的内容，原因，位置
        *   2.在getEelement方法中，灭有异常处理逻辑，try catch，那么jvm就会把异常对象抛出给方法的调用者
        *   main方法来处理这个异常
        * */
        return ele;
    }
}
