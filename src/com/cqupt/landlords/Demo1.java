package com.cqupt.landlords;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demo1 {

    // 斗地主
    /*
    * 1.准备牌
    * 2.洗牌
    * 3.发牌
    * 4.看牌
    * */
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        //定义两个数组，一个存储花色，一个存储牌的序号
        String[] colors = {"♥","♠","♦","♣"};
        String[] numbers = {"2","A","k","Q","J","10","9","8","7","6","5","4","3"};
        poker.add("大王");
        poker.add("小王");

        // 将牌组装之后放入poker中
        for(String num:numbers){
            for(String colo:colors){
                poker.add(num+colo);
            }
        }
        System.out.println(poker);

        // 洗牌
        Collections.shuffle(poker);

        // 发牌
        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            if(i>=51){
                dipai.add(p);
            }else if(i%3==0){
                p1.add(p);
            }else if(i%3==1){
                p2.add(p);
            }else if(i%3==2){
                p3.add(p);
            }
        }

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
