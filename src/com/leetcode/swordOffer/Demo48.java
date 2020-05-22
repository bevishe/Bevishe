package com.leetcode.swordOffer;

import org.omg.PortableInterceptor.INACTIVE;

import java.sql.SQLOutput;
import java.util.HashMap;

/**
 * @Classname Demo48
 * @Description TODO
 * @Date 2020/4/10 10:10
 * @Created by Administrator
 */
public class Demo48 {

    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        else if(s.length() == 1) return 1;
        // 使用双指针滑动窗口实现
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int left = 0 ,right = 0, maxSize = 0;
        hashMap.put(s.charAt(0),0);
        for (; left <= right && left < s.length();) {
            if(right + 1 == s.length()) return maxSize;
            // right 向右移动，判断加入了当前元素后，是否需要将left右移动，完成了没有重复的元素的子串之后就将当前right - left + 1 和maxSize比较
            if(hashMap.containsKey(s.charAt(++right))){

                // 还需要将从原来的left到现在的left之间的元素都从hashMap中删除
                for (int i = left; i < hashMap.get(s.charAt(right)); i++) {
                    System.out.println(i);
                    System.out.println(s.charAt(i));
                    hashMap.remove(s.charAt(i));
                }
                left = hashMap.get(s.charAt(right)) + 1;
                hashMap.put(s.charAt(right),right);
            }else{
                hashMap.put(s.charAt(right),right);
            }
            maxSize = maxSize > (right - left + 1) ? maxSize : right - left + 1;
        }
        return maxSize;
    }

    public static void main(String[] args) {
        Demo48 demo48 = new Demo48();
        System.out.println(demo48.lengthOfLongestSubstring("abba"));

        for (int i = 0; i <9; i++) {
            System.out.println(i);

        }
    }
}
