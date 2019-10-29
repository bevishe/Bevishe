package com.cqupt.debug;

import java.util.*;

public class Demo2 {

    /*
    * 斗地主：
    * 1.准备牌，（大小王，52张牌（遍历花色和数字的list集合进行拼接））
    *   将拼接好的牌存储到map集合中，index和拼接好的牌
    * 2.洗牌，发牌
    *  collections中的shuffle（list）
    *   一人一张轮流发牌，最后三张给底牌
    *   使用集合的index来mod3
    *   p1List p2List p3List Dlist
    * 3.对牌进行排序
    *  collecitons.sort(p1List)
    * 4.显示牌
    * */
    public static void main(String[] args) {
        // 1.准备牌
        ArrayList<String> colors = new ArrayList<>();
        colors.add("♠");
        colors.add("♦");
        colors.add("♥");
        colors.add("♣");

        LinkedList<String> nums = new LinkedList<>();
        nums.add("2");
        nums.add("A");
        nums.add("K");
        nums.add("Q");
        nums.add("J");
        for (int i = 10; i >=3 ; i--) {
            nums.add(String.valueOf(i));
        }


        //
        HashMap<Integer,String> poker = new HashMap<>();
        poker.put(0,"大王");
        poker.put(1,"小王");
        int i = 2;

        for (String num : nums) {
            for (String color : colors) {
                poker.put(i,color+num);
                i ++;
            }
        }
        System.out.println(poker);

        // 2.洗牌
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        for (int j = 0; j <= 53; j++) {
            pokerIndex.add(j);
        }
        Collections.shuffle(pokerIndex);

        // 3.发牌
        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        ArrayList<Integer> p3 = new ArrayList<>();
        ArrayList<Integer> D = new ArrayList<>();
        for (int i1 = 0; i1 < pokerIndex.size(); i1++) {
            if(i1>=51){
                D.add(pokerIndex.get(i1));
            }else if(i1%3==0){
                p1.add(pokerIndex.get(i1));
            }else if(i1%3==1){
                p2.add(pokerIndex.get(i1));
            }else {
                p3.add(pokerIndex.get(i1));
            }
        }

        // 4.排序并看牌
        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(D);

        for (Integer integer : p1) {
            System.out.print(poker.get(integer)+" ");
        }
        System.out.println();
        for (Integer integer : p2) {
            System.out.print(poker.get(integer)+" ");
        }
        System.out.println();
        for (Integer integer : p3) {
            System.out.print(poker.get(integer)+" ");
        }
        System.out.println();
        for (Integer integer : D) {
            System.out.print(poker.get(integer)+" ");
        }
    }
}
