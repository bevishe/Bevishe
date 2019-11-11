package com.cqupt.recursive;

public class Demo1 {
    /*
     * 递归一定要有条件限制，否者会造成栈溢出
     * 当一个方法调用其他方法的时候，被调用的方法会执行完毕才
     * */
    public static void main(String[] args) {
        //a();
        b(1);
    }

    private static void a(){
        System.out.println("a方法");
        a();
    }

    private static void b(int i){
        System.out.println(i);
        if(i==1000){
            return;
        }
        b(++i);
    }
}
