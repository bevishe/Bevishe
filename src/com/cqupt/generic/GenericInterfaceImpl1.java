package com.cqupt.generic;

public class GenericInterfaceImpl1 implements GenericInterface<String>{



    // 含有泛型的第一种实现方式，定义接口的实现类，实现接口，
    /*
    * public interface Interator<E>{
    *   E next();
    * }
    * Scanner类实现了Iterator接口，并指定接口的泛型为String，所以重写的next方法泛型默认就是String
    * public final class Scanner implements Interator<String>{
    *   public String next(){
    *
    *   }
    * }
    * */

    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
