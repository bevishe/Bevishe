package com.work.day5_24;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo1 {


    public int soulution(int x,int y){
        int re = 0;
        int coutX = x/2,coutY = y/2;
        if(2*coutX == x){
            // 高度刚好完整
            if(2*coutY == y){
                re += 0;
            }else{
                re += x/2;
            }
        }else{
            if(2*coutY == y){
                re += y/2;
            }else{
                re = re + x/2 + y/2 + 1;
            }
        }
        return re + coutX * coutY;
    }

    public static void main(String[] args) {
//        Demo1 demo1 = new Demo1();
//        System.out.println(demo1.soulution(5,3));
//
//
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNextLine()){
//            String s = scanner.nextLine();
//            System.out.println("has next line");
//        }


        final ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        System.out.println(arrayList.get(0));
        arrayList.set(0,2);
        System.out.println(arrayList.get(0));
        Object o = new Object();
    }

}
