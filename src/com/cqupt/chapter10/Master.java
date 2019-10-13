package com.cqupt.chapter10;

import java.util.ArrayList;
import java.util.Random;

public class Master extends User {

    public Master() {
    }

    public Master(String name, double money) {
        super(name, money);
    }

    public ArrayList sendMoney(double money,int count){
        ArrayList<Double> arrayList = new ArrayList<>();

        //群主当前余额
        double leftMoney = super.getMoney();
        if(money>leftMoney){
            System.out.println("你的余额不足！");
            return arrayList;
        }

        //扣钱
        super.setMoney(leftMoney-money);

        //发红包
        double c = money / count;
        for (int i = 0; i < count; i++) {
            arrayList.add(c);
        }

        return arrayList;
    }
}

