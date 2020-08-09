package com.leetcode.array;

public class Demo714 {


    public int maxProfit(int[] prices,int fee){
        // 不持有股票时的最大利润和持有股票时的最大利润
        int cash = 0,hold=-prices[0];
        for (int i = 0; i < prices.length; i++) {
            cash = Math.max(cash,hold+prices[i]-fee);
            hold = Math.max(hold,cash - prices[i]);
        }
        return cash;
    }

    public static void main(String[] args) {

    }
}
