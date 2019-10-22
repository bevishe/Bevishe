package com.cqupt.generic;

public class Demo5 {



    public static void main(String[] args) {
        GenericInterfaceImpl2<String> g2 = new GenericInterfaceImpl2<>();
        g2.method("hello");

        GenericInterface<Integer> g22 = new GenericInterfaceImpl2<>();
        g22.method(123);

    }
}
