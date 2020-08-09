package com.leetcode.stock;

public class Demo122 {
    // 买卖股票的最佳时节 ii

    public int maxProfit(int[] prices){
        /*
        * 思路：
        * 使用滑动窗口，buy和sell分别记录了买入和卖出的金额，从前往后一次遍历赋值给sell，
        * 判断当前的利润
        * 若当前利润小于零，则移动滑动窗口的buy为当前的sell，并将之前的利润放入总利润中，并将tempProfit置0
        * 否则判断当前的利润比之前记录的利润大，则滑动窗口可以继续滑动
        * 若比直接的利润少，则需要将之前的订单进行加入总订单里面，并将tempProfit置0
        * 最后的总利润需要时总利润加上tempProfit，以为当最后一个订单在最后卖出时，tempProfit没有加入
        * */
        if(prices == null || prices.length ==0 || prices.length == 1)
            return 0;
        int profit = 0,buy = prices[0],sell,tempProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            sell = prices[i];
            if(sell - buy < 0){
                profit += tempProfit;
                tempProfit =0;
                buy = sell;
            }else{
                if(sell - buy <= tempProfit){
                    profit += tempProfit;
                    tempProfit = 0;
                    buy = sell;
                }else{
                    tempProfit = sell - buy;
                }
            }
        }
        return profit + tempProfit;
    }


    public static void main(String[] args) {
        Demo122 demo122 = new Demo122();
        System.out.println(demo122.maxProfit(new int[]{1,2,3,4,5}));
    }

}
