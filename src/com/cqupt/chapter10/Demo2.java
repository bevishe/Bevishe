package com.cqupt.chapter10;

import com.cqupt.chapter7.Person;

import java.awt.geom.NoninvertibleTransformException;
import java.util.ArrayList;

public class Demo2 {

    public static void main(String[] args) {
        Master m = new Master("群主",100);
        ArrayList<Double> moneyGift= m.sendMoney(50,5);

        NormalPerson p1 = new NormalPerson("p1",0);
        NormalPerson p2 = new NormalPerson("p2",0);
        NormalPerson p3 = new NormalPerson("p3",0);
        NormalPerson p4 = new NormalPerson("p4",0);
        NormalPerson p5 = new NormalPerson("p5",0);
        NormalPerson p6 = new NormalPerson("p6",0);

        p1.receive(moneyGift);
        p2.receive(moneyGift);
        p3.receive(moneyGift);
        p4.receive(moneyGift);
        p5.receive(moneyGift);
        p6.receive(moneyGift);


        p1.show();
        p2.show();
        p3.show();
        p4.show();
        p5.show();
        p6.show();




    }
}
