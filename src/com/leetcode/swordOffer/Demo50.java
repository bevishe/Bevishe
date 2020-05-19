package com.leetcode.swordOffer;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * @Classname Demo50
 * @Description TODO
 * @Date 2020/4/9 21:29
 * @Created by Administrator
 */
public class Demo50 {

    /*
    * 在字符串s中找出第一个只出现一次的字符，如果没有，返回一个空格
    * */
    public char firstUniqChar(String s){
        if(s == "") return ' ';
        LinkedHashMap<Character,Integer> hashMap = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if(hashMap.containsKey(s.charAt(i)))
                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
            else hashMap.put(s.charAt(i),0);
        }

        Set<Character> set = hashMap.keySet();
        for (Character character : set) {
            if(hashMap.get(character) == 1) return character;
        }
        return ' ';
    }

    public static void main(String[] args) {
        Demo50 demo50 = new Demo50();
        System.out.println(demo50.firstUniqChar("agdsafsadf"));
    }
}
