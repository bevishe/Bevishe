package com.cqupt.chapter13;


/*当final关键字修饰一个类
* 格式：public final class 类名称{
*
* }
*
* 含义：当前这个类不能有任何子类，（太监类），一定有父类
*
* 注意：一个类如果是final的，那么其中所有的方法都不可以进行覆盖重写（因为没有子类）
* */
public final class MyClass {

    public void method(){
        System.out.println("方法执行！");
    }

}
