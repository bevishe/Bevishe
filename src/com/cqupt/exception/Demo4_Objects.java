package com.cqupt.exception;

import java.util.Objects;

public class Demo4_Objects {
    /**
     * Objects类中的静态方法
     *
     */
    public static void main(String[] args) {
        method(null);
    }


    public static void method(Object object){
//        if(object==null){
//            throw new NullPointerException("传递的对象是个空的");
//        }
//        Objects.requireNonNull(object);
        Objects.requireNonNull(object,"传递的对象是空的！");
    }
}
