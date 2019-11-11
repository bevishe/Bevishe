package com.cqupt.list;

import java.util.Iterator;

public class Demo6 {

    public static void main(String[] args) {

        MyContainer myContainer = new MyContainer();
        // 多态 接口指向实现接口类的对象
        Iterator iterator = myContainer.iterator();
//        iterator.hello();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
