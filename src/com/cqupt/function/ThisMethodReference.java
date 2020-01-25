package com.cqupt.function;

public class ThisMethodReference {
    /*
    * 通过this引用本类的成员方法
    * */

    // 定义买房子的方法
    public void buyHouse(){
        System.out.println("买了一套房子");
    }

    // 定义一个结婚的方法，参数传递Richable接口
    public void marry(Richable richable){
        richable.buy();
    }

    // 定义一个非常高兴的方法
    public void soHappy(){
        // 调用结婚的方法，方法的参数Richable是一个函数式接口，传递lambda表达式
        marry(()->{
            this.buyHouse();
        });
    }

    // 使用方法引用的方法来实现
    /*
    * this是已经存在的，本类的成员方法buyHouse也是已经存在的，所以可以直接使用this引用本类的成员方法
    * */
    public void soHappyPlus(){
        marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new ThisMethodReference().soHappy();
        new ThisMethodReference().soHappyPlus();
    }
}
