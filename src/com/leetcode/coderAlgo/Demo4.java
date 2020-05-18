package com.leetcode.coderAlgo;

public class Demo4 {

    public boolean canPermutePalindrome(String s) {
        // 是否是回文字符串的一种排列 ，是回文的话 至多只有一个字符个数是单数
        /*
        * 1.暴力方法：使用hashMap存储每个字符的出现次数，统计出现单数次数字符的个数
        *
        * */
        // 2.使用位运算
        long highBmp = 0,lowBmp = 0;
        for (int i = 0; i < s.length(); i++) {
            highBmp ^= 1l<<(s.charAt(i) - 64);
        }
        return Long.bitCount(highBmp) <= 1;
    }

    public static void main(String[] args) {
        System.out.println(Long.bitCount(1l<<1));
        System.out.println(Long.bitCount(1l<<'a'));
        System.out.println(Integer.valueOf('a'));
    }
}
