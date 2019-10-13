package com.cqupt.chapter7;

import java.util.Scanner;

public class Demo2_Sum {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int a = sca.nextInt();
        int b = sca.nextInt();
        System.out.println(a+"+"+b+"="+(a+b));
        sca.close();
    }
}
