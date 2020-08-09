package com.leetcode.interview;

import com.work.day7_3.Demo1;

public class Demo38 {

    public String countAndSay(int n){
        String[] re = new String[n];

        for (int i = 0; i < n; i++) {
            if(i == 0){
                re[i] = "1";
                continue;
            }
            StringBuilder stringBuilder = new StringBuilder();
            int curLen = re[i-1].length();
            // 对前面的字符进行读操作
            int j = 0;
            while(j<curLen){
                char curChar = re[i-1].charAt(j);
                int curCharCount = 1;
                while(j+1<curLen && curChar == re[i-1].charAt(j+1)){
                    j++;
                    curCharCount ++;
                }
                j += 1;
                stringBuilder.append(""+curCharCount+curChar);
            }
            re[i] = stringBuilder.toString();
        }

        return re[n-1];
    }

    public static void main(String[] args) {
        Demo38 demo38 = new Demo38();
        System.out.println(demo38.countAndSay(5));
    }
}
