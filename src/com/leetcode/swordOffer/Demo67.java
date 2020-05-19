package com.leetcode.swordOffer;

import java.math.BigInteger;

/**
 * @Classname Demo67
 * @Description TODO
 * @Date 2020/4/7 11:18
 * @Created by Administrator
 */
public class Demo67 {

    public int strToInt(String str){
        //1.判断第一个非空字符是否有效
        // 2.截取有效的子串
        StringBuilder intString = new StringBuilder();
        int curIndex = 0;
        while(curIndex<str.length() && str.charAt(curIndex) == ' ') curIndex++;
        if(curIndex < str.length() && (Character.isDigit(str.charAt(curIndex)) || str.charAt(curIndex) == '-' || str.charAt(curIndex) == '+')){
            int symbol = 1;
            if(str.charAt(curIndex) == '-'){
                symbol = -1;
                curIndex +=1;
            }else if(str.charAt(curIndex) == '+'){
                curIndex += 1;
            }
            long re = 0;
            for (int i = curIndex; i < str.length(); i++) {
                char c = str.charAt(i);
                // 判断当前字符是数字
                if(Character.isDigit(c)){
                    re = 10 * re + Integer.parseInt(String.valueOf(c));
                    if(symbol*re > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                    if(symbol*re < Integer.MIN_VALUE) return Integer.MIN_VALUE;
                }else {
                    if(symbol*re > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                    if(symbol*re < Integer.MIN_VALUE) return Integer.MIN_VALUE;
                    return (int)re*symbol;
                }
            }
            return (int)re*symbol;
        }else{
            return 0;
        }

        // 3.判断子串的正负，已经是否溢出
    }

    public static void main(String[] args) {

    }
}
