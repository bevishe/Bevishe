package com.leetcode.swordOffer;

import java.util.ArrayList;

/**
 * @Classname Demo14_1
 * @Description TODO
 * @Date 2020/3/5 9:05
 * @Created by Administrator
 */
public class Demo14_1 {

    // 用来记录所有情况的绳子分段之后的乘积数
    private static ArrayList<Integer> arrayList = new ArrayList<>();

    // 需求，给出绳子长度n
    public static int cuttingRope(int n){
        int num_3 = n / 3,reMax = 1;
        if(n%3 == 1){
            // 最后的御魂为1，需要将1和最后一个3连起来当成两个2
            for (int i = 0; i < n/3-1; i++) {
                reMax *= 3;
            }
            return 4*reMax;
        }else{
            // 可以被三整除或者是余数为2
            for (int i = 0; i < n / 3; i++) {
                reMax *= 3;
            }
            return n%3==0?reMax:(2*reMax);
        }
    }




    public static void main(String[] args) {

    }
}
