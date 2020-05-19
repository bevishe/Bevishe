package com.leetcode.swordOffer;

/**
 * @Classname Demo58_2
 * @Description TODO
 * @Date 2020/4/8 18:38
 * @Created by Administrator
 */
public class Demo58_2 {

    public String reverseLeftWords(String s,int n){
        if(s == null || s.length() == 0 || s.length() == 1) return s;
        StringBuilder string = new StringBuilder();
        // 直接找到新的起点，进行拼接
        for (int i = n; i < n+s.length(); i++) {
            string.append(s.charAt(i%s.length()));
        }

        return string.toString();
    }

    public static void main(String[] args) {
        Demo58_2 demo58_2 = new Demo58_2();
        System.out.println(demo58_2.reverseLeftWords("abcdefg",2));
    }
}
