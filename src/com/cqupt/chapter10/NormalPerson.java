package com.cqupt.chapter10;

import java.util.ArrayList;
import java.util.Random;

public class NormalPerson extends User {

    public NormalPerson() {
    }

    public NormalPerson(String name, double money) {
        super(name, money);
    }


    public void show(){
        System.out.println("我叫"+this.getName()+"我现在有"+this.getMoney()+"钱");
    }

    public double receive(ArrayList<Double> arrayList){
        if(arrayList.isEmpty() != true){
            int index = new Random().nextInt(arrayList.size());
            this.setMoney(this.getMoney()+arrayList.get(index));
            return arrayList.remove(index);
        }else {
            System.out.println("红包空了！");
            return -1;
        }

    }
}
