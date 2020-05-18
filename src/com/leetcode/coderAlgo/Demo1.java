package com.leetcode.coderAlgo;

import java.util.HashSet;

public class Demo1 {

    public boolean isUnique(String astr){
        if(astr == null || astr.length() == 0) return true;
        HashSet<Character> set = new HashSet<>();
        char[] chaArr = astr.toCharArray();
        for (char c : chaArr) {
            if(set.contains(c)) return false;
            else set.add(c);
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
