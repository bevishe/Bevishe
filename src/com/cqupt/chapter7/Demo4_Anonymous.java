package com.cqupt.chapter7;

import com.sun.xml.internal.stream.Entity;

import java.util.Scanner;

public class Demo4_Anonymous {
    public static void main(String[] args) {
//        Scanner sca = new Scanner(System.in);
//        String num = sca.next();
//        sca.close();
//
//        int num1 = new Scanner(System.in).nextInt();
//        System.out.println(num1);

        //使用匿名对象进行穿传参
        methodParam(new Scanner(System.in));

        Scanner s = MethodReturn();
        int n = s.nextInt();
        System.out.println(n);
    }

    public static void methodParam(Scanner scanner){
        int num = scanner.nextInt();
        System.out.println(num);
    }

    public static Scanner MethodReturn(){
        return new Scanner(System.in);
    }
}
