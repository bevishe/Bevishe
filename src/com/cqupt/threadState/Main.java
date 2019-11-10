package com.cqupt.threadState;

public class Main {

    public static void main(String[] args) {
        BaoZi baoZi = new BaoZi();
        Customer customer = new Customer(baoZi);
        Producer producer = new Producer(baoZi);
        customer.start();
        producer.start();
    }
}
