package com.leetcode.stock;

public class Demo123 {



    // 买卖股票的最佳时机iii，最多可以完成两次交易
    public int maxProfit(int[] prices){
        if(prices == null || prices.length == 0 || prices.length == 1) return 0;
        int profit = 0;
        int pricesNum = prices.length;
        int[] left = new int[pricesNum],right = new int[pricesNum];

        // 从左往右开始遍历在每个数的昨天最大利润；
        int minPrice = prices[0],maxTemp = 0;
        for (int i = 0; i < pricesNum; i++) {
            left[i] = Math.max(maxTemp,prices[i]-minPrice);
            maxTemp = Math.max(maxTemp,left[i]);
            minPrice = Math.min(minPrice,prices[i]);
        }

        // 从右向左开始遍历，从当前办理的节点开始买入，可以得到的最大收入是
        int maxPrice = prices[pricesNum -1];
        maxTemp = 0;
        for (int i = pricesNum-1; i >= 0; i--) {
            right[i] = Math.max(maxPrice - prices[i],maxTemp);
            maxTemp = Math.max(right[i],maxTemp);
            maxPrice = Math.max(maxPrice,prices[i]);
        }

        // 使用双指正从两边向中间来找，求取最大的和
        for (int i = 0; i < pricesNum-1; i++) {
            // 最多买两次
            profit = Math.max(left[i]+right[i+1],profit);
        }
        // 需要考虑值买一次，第一天买，最后一天卖
        profit = Math.max(profit,prices[pricesNum-1] - prices[0]);
        return profit;
    }

    public static void main(String[] args) {
        Demo123 demo123 = new Demo123();
        System.out.println(demo123.maxProfit(new int[]{1,2,4,3,4}));
    }
}
