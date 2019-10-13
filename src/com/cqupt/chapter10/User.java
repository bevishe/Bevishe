package com.cqupt.chapter10;

import javax.jws.soap.SOAPBinding;

public class User {
    private String name;
    private double money;

    public User() {

    }

    public User(String name, double money){
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
