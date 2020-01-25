package com.cqupt.function;

public class Demo2 {

    //用来测试通过对象名来引用方法
    public static void printString(Printable printable){
        printable.print("hello");
    }


    public static void main(String[] args) {
        // 使用Lambda的方法
        printString(s-> System.out.println(s));

        //
        printString((s)->{
            MethodRerObject methodRerObject = new MethodRerObject();
            methodRerObject.printUpperCaseString(s);
        });

        // 使用方法引用,简化了代码
        printString(new MethodRerObject()::printUpperCaseString);
    }
}
