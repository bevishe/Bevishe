package com.nowcoder;

public class Demo3 {

    /*
    * 考察的知识点是：在继承中执行代码的迅速
    *
    * 1.父类中的静态成员变量，父类中的静态代码块
    * 2.子类中的静态成员变量，子类中的静态代码块
    * 3.父类中非静态对象，父类中的非静态代码块
    * 4.父类构造方法
    * 5.子类中的非静态成员变量，子类中的非静态代码块
    * 6.子类构造方法
    *
    *
    *
    * 成员变量高于构造方法，静态高于非静态的，父类的高于子类的
    * */


}


class Demo {

    class Super{

        int flag=1;
        Super(){
            test();
        }

        void test(){
            System.out.println("Super.test() flag="+flag);
        }
    }

    class Sub extends Super{

        Sub(int i){  flag=i;
            System.out.println("Sub.Sub()flag="+flag);
        }
        void test(){
            System.out.println("Sub.test()flag="+flag);
        }
    }

    public static void main(String[] args){
        new Demo().new Sub(5);
    }
}