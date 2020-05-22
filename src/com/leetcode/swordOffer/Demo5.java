package com.leetcode.swordOffer;

/**
 * @Classname demo5
 * @Description TODO
 * @Date 2020/2/15 18:58
 * @Created by Administrator
 */
public class Demo5 {

    /**
     * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
     *
     * */

    public static String replaceSpace(String s){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') stringBuilder.append("%20");
            else stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) {

    }
}
