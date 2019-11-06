package com.cqupt.exception;

public class Demo9_Finally {

    public static void main(String[] args) {
        int a = getA();
        System.out.println(a);

    }

    // 不要在finally里面写return 一定会返回finally中的结果
    public static int getA(){
        int a = 10;
        try{
            return a;
        }catch (Exception e){
            System.out.println(e);
        }finally {
            a = 100;
            return a;
        }
    }
}
