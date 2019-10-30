package com.cqupt.generic;

public class GenericInterfaceImpl2<E> implements GenericInterface<E> {

    /*
    * 含有泛型的接口第二种使用方式，接口使用什么泛型，实现类就使用什么泛型，类跟着接口走
    * 就相当于顶一个含有泛型的类，创建对象的时候确定泛型的类型
    *
    *
    * */


    @Override
    public void method(E e) {
        System.out.println(e);
    }
}
