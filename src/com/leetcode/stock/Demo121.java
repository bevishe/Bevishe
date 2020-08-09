package com.leetcode.stock;

public class Demo121 {
    // 买卖股票的最佳时机


    /*
    *
    *给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
    如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
    注意：你不能在买入股票前卖出股票。
    来源：力扣（LeetCode）
    链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    *
    *
    * */

    public int maxProfit(int[] prices){
        if(prices == null || prices.length == 0 || prices.length == 1)
            return 0;
        int profit = 0,buy = prices[0],sell=prices[0];
        for (int i = 0; i < prices.length; i++) {
            sell = prices[i];
            profit = Math.max(profit,sell-buy);
            if(sell < buy) buy = sell;
        }
        return profit;
    }

    public static void main(String[] args) {
        Demo121 demo121 = new Demo121();
        System.out.println(demo121.maxProfit(new int[]{7,1,5,3,6,4}));
    }


}
