package com.thinkInJava.chapter7;

public class Soap {

    private String s;

    Soap() {
        System.out.println("Scope()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;

    }
}
