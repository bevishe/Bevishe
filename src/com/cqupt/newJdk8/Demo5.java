package com.cqupt.newJdk8;

public class Demo5 {


    /*
    *
    * 使用lambda优化日志案例
    * lambda的特点：延迟加载
    *
    *
    * */

    public static void showLog(int level,MessageInterface messageInterface){
        if(level==1){
            System.out.println(messageInterface.builderMessage());
        }
    }

    /*
    * 使用lambd表达式作为参数传递，仅仅是把参数传递到showLog中
    * 只有满足条件，日子的登记是一级，才会调用接口中的builderMeassage才会进行字符串的拼接
    *
    * 2.如果条件不满足，日志的等级不是一级，那么MessageInterface中的builderMessage也不会执行，拼接字符串的代码也不会执行，不会有性能的浪费
    * */

    public static void main(String[] args) {
        String mess1 = "hello";
        String mess2 = "world";
        String mess3 = "java";

        showLog(2,()->{
            // 返回一个拼接好的字符串
            System.out.println("不满足条件不执行");
            return mess1+mess2+mess3;
        });
    }



}
