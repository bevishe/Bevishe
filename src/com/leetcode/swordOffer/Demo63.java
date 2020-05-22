package com.leetcode.swordOffer;

/**
 * @Classname Demo63
 * @Description TODO
 * @Date 2020/4/7 21:01
 * @Created by Administrator
 */
public class Demo63 {

    public int maxProfit(int[] prices){
        if(prices.length<=1) return 0;
        int grade = 0;
        // 暴力的话复杂度是n方

        //假设前一天买后一天卖
        int[] p = new int[prices.length-1];
        for (int i = 0; i < p.length; i++) {
            p[i] = prices[i+1] - prices[i];
        }

        // 从后往前遍历
        grade = p[p.length - 1];
        for (int i = p.length -1; i >=0; i--) {
            int temp = p[i],maxTemp = p[i],j=i-1;
            while(j>=0 && temp + p[j]>=0){
                temp+=p[j];
                j--;
                maxTemp = maxTemp > temp ? maxTemp:temp;
            }
            p[i] = maxTemp;
            grade = grade > p[i] ? grade : p[i];
        }
        return grade;
    }

    public static void main(String[] args) {

    }
}
