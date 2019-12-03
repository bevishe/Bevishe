package com.cqupt.newJdk8;

public class Demo4Logger {

    // 日志案例：
    /*
    * 定义一个根据日志的级别，显示日志的方法
    * 发现以下代码存在一些性能浪费的问答，
    * 调用showLog方法，传递的第二个参数是一个拼接后的字符串
    * 那么就是
    * */


    public static void showLog(int level,String mess){
        if(level == 1){
            System.out.println(mess);
        }
    }

    public static void main(String[] args) {
        // 定义三个日志信息
        String mess1 = "hello";
        String mess2 = "world";
        String mess3 = "java";

        showLog(1,mess1);
        showLog(2,mess2);
        showLog(1,mess3);

        showLog(1,mess1+mess2+mess3);

    }
}
