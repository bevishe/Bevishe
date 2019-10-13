package com.cqupt.chapter11;

public interface MyInterfaceDefault {
    //默认方法

    public default void methodDefault(){

    }

    void aa();

    // 新添加的方法改为默认方法
    public default void bb(){
        System.out.println("这是新添加的默认方法！");
    }

}
