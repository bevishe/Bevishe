package com.leetcode.coderAlgo;

public class Demo3 {

    public String replaceSpaces(String S, int length) {
        StringBuilder stringBuilder = new StringBuilder();
        int sIndex = 0;
        while(length-->0){
            if(S.charAt(sIndex) == ' ') stringBuilder.append("%20");
            else stringBuilder.append(S.charAt(sIndex));
            sIndex++;
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {

    }
}
