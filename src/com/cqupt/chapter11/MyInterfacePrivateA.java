package com.cqupt.chapter11;

public interface MyInterfacePrivateA {
    public default void methodA(){
        System.out.println("mehtoda");
    }

    public default void methodB(){
        System.out.println("methodb");
    }

    //在java9中才可以使用
//
//    private void mehodCommon(){
//        System.out.println("aaa");
//        System.out.println("bbb");
//        System.out.println("ccc");
//    }
}
