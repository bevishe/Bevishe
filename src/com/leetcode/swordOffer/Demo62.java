package com.leetcode.swordOffer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Classname Demo62
 * @Description TODO
 * @Date 2020/4/7 21:53
 * @Created by Administrator
 */
public class Demo62 {

    /*
    * 约瑟夫环问题：
    *
    *
    * */

    // 转圈记数
    public int lastRemaining(int m,int n){
        ArrayList<Integer> arrayList = new ArrayList<>();
        int count = 0,removeIndex = 0,t=0;
        while(count<n){
            arrayList.add(count++);
        }
        int arrLength = arrayList.size();
        while(arrayList.size()>1){
            removeIndex = (removeIndex + m -1)%n;
            arrayList.remove(removeIndex);
            n--;
        }
        return arrayList.get(0);
    }

    public static void main(String[] args) {
        Demo62 demo62 = new Demo62();
        System.out.println(demo62.lastRemaining(3,5));
    }
}
