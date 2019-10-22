package com.cqupt.chapter15;
/*
* 局部内部类：如果希望访问所在方法的局部变量，那么这个局部变量必须是有效的final
* 从java8开始，只要局部变量事实，那么final关键字可以省略
*
* 原因：
* 1.new出来的对象在堆内存中
* 2.局部变量是跟着方法走的，在栈内存中
* 3.方法运行结束之后，立刻出栈，局部变量就会立刻消失
* 4.new出来的对象会在堆当中持续存在，直到垃圾回收
* */

public class MyOuter {
    public void methodOuter(){

        int num =10;

        class MyInner{
            public void methodInner(){
                System.out.println(num);
            }
        }

    }
}
