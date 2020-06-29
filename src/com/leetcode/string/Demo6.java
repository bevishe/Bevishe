package com.leetcode.string;

public class Demo6 {


    // z字行打印
    public String convert(String s, int numRows) {
        StringBuilder reString = new StringBuilder();

        // 外层循环是哪一行
        for (int i = 0; i < numRows; i++) {
            // 内层训练是遍历整个字符串
            for (int j = 0; j < s.length(); j++) {
                if(j%(2*numRows - 2) == i)
                    reString.append(s.charAt(j));
                if(2*numRows - 2 - i > i && j%(2*numRows - 2) == (2*numRows - 2 -i))
                    reString.append(s.charAt(j));
            }
        }
        return reString.toString();
    }

    public static void main(String[] args) {
        Demo6 demo6 = new Demo6();
        System.out.println(demo6.convert("LEETCODEISHIRING",4));

    }
}
