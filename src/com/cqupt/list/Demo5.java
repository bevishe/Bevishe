package com.cqupt.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Demo5 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");

        Iterator<String> iterator= arrayList.iterator();

        int a = 1;
        Integer ai = a;


        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
