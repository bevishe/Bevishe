package com.cqupt.chapter7;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test2_ArrayList {

    public static ArrayList<Integer> get_List(ArrayList<Integer> listOld){
        ArrayList<Integer> listNew = new ArrayList<>();
        for (int i = 0; i < listOld.size(); i++) {
            if(listOld.get(i) % 2 == 0){
                listNew.add(listOld.get(i));
            }
        }
        return listNew;
    }

    public static void main(String[] args) {
        Random ran = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            arrayList.add(ran.nextInt(14));
        }
        ArrayList<Integer> a = new ArrayList<>();
        a = get_List(arrayList);
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));

        }
    }
}
