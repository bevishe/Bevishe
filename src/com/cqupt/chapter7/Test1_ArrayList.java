package com.cqupt.chapter7;

import java.util.ArrayList;
import java.util.Random;

public class Test1_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Random ran = new Random();

        for (int i = 0; i < 12; i++) {
            array.add(ran.nextInt(33)+1);
        }

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}