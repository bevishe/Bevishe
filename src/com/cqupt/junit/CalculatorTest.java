package com.cqupt.junit;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int re = calculator.add(1,2);
        System.out.println(re);
    }
}