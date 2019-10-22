package com.cqupt.chapter16;

public class Demo1 {

    /*
     * 如果接口的实现类或者是父类的子类只需要实现一次
     * 那么这种情况可以省略该类的定义，而改为实现匿名内部类
     *
     * 格式：
     * */
    public static void main(String[] args) {

        MyInterface myInterfaceimpl = new MyInterfaceImpl();
        myInterfaceimpl.method();

        // 使用匿名内部类
        MyInterface inter = new MyInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类覆盖重写的接口抽象方法！");
            }

            @Override
            public void mehtod2() {
                System.out.println("实现的另外一个抽象方法");
            }
        };
        inter.method();
        inter.mehtod2();

        // 使用匿名内部类,省略了对象名称
        new MyInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类,而且是匿名对象覆盖重写的接口抽象方法！");
            }

            @Override
            public void mehtod2() {
                System.out.println("实现的另外一个抽象方法");
            }
        }.method();
    }
}