package com.cqupt.map;

import java.util.*;

public class Test1_Map {
    /*
    * 练习：计算每一个字符串中每一个字符出现的次数
    * 1.使用Scanner从键盘获取字符串
    *
    * 2.遍历字符串
    *
    * 3.用hashmap来存储字符和字符出现的次数
    *
    * */
    public static void main(String[] args) {

        System.out.println("enter your String:");
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.next().toCharArray();

        HashMap<Character,Integer> hashMap = new HashMap<>();

        for (char aChar : chars) {
            if(hashMap.containsKey(aChar)){
                hashMap.put(aChar,hashMap.get(aChar)+1);
            }else{
                hashMap.put(aChar,1);
            }
        }

        // 使用entry来遍历hashMap
        Set<Map.Entry<Character,Integer>> mapEntry = hashMap.entrySet();
        for (Map.Entry<Character, Integer> characterIntegerEntry : mapEntry) {
            System.out.println(characterIntegerEntry.getKey()+"--"+characterIntegerEntry.getValue());
        }
    }
}
