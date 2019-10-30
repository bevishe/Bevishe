package com.cqupt.chapter17;

import java.util.ArrayList;

public class Bootstrap {

    /*
    * 场景：红包发出去，所有人都有红包，大家抢完了最后一个红包给群主自己，
    *
    * 红包发的策略：
    * 1.普通红包  除不尽的时候，将余数放到最后一个红包里面
    * 2.手气红包  最少1分钱，最多不超过平均数的2倍，应该是越发越少
    * */


    public static void main(String[] args) {
        Person p1 = new Person("teacher",0);
        Person stu1 = new Person("stu1",0);
        Person stu2 = new Person("stu2",0);
        Person stu3 = new Person("stu3",0);

        OpenMode randomMode = new RandomMode();

        ArrayList<Integer> list = randomMode.divide(100,4);
        System.out.println(list);

        p1.setMoney(list.remove(0));
        stu1.setMoney(list.remove(0));
        stu2.setMoney(list.remove(0));
        stu3.setMoney(list.remove(0));

        System.out.println(p1.getMoney());
        System.out.println(stu1.getMoney());
        System.out.println(stu2.getMoney());
        System.out.println(stu3.getMoney());





    }
}
