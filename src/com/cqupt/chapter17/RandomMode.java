package com.cqupt.chapter17;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney,final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();

        //随机分配，对少一分，最多不超过剩下金额平均数的2倍
        Random ran = new Random();
        int leftMoney = totalMoney;
        int leftCount = totalCount;
        for (int i = 0; i < totalCount-1; i++) {
            int money = 1 + ran.nextInt(leftMoney/leftCount *2);
            list.add(money);
            leftCount -= 1;
            leftMoney = leftMoney - money;
        }
        list.add(leftMoney);
        return list;
    }
}
