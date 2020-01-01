package com.cqupt.function;

public class Demo3 {

    private static void printString(Printable printable){
        printable.print("hello");
    }

    public static void main(String[] args) {
        // 通过类名来引用静态的方法
        printString((s)->{
            StaticMethodRerObject.printUpCaseString(s);
        });

        // 使用方法引用的方法
        printString(StaticMethodRerObject::printUpCaseString);
    }
}
