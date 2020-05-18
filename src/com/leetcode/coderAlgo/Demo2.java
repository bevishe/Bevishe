package com.leetcode.coderAlgo;

import java.util.*;

public class Demo2 {

    public boolean CheckPermutation(String s1,String s2){
        if(s1.length() != s2.length()) return false;
        if(s1 == null && s2 == null) return true;
        else if(s1 != null && s2 != null) {
            HashMap<Character, Integer> hashMap = new HashMap<>();
            char[] s1Arr = s1.toCharArray(), s2Arr = s2.toCharArray();
            for (char c : s1Arr) {
                if (hashMap.containsKey(c)) hashMap.put(c, hashMap.get(c) + 1);
                else hashMap.put(c, 1);
            }
            for (char c : s2Arr) {
            if (hashMap.containsKey(c)) {
                if (hashMap.get(c) == 1) hashMap.remove(c);
                else hashMap.put(c, hashMap.get(c) - 1);
            } else {
                return false;
            }
        }
        return hashMap.size() == 0 ? true : false;
    }else{
        return false;
    }
    }

    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        Collection<String> b = new HashSet<>();

    }
}
