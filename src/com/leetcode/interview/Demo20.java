package com.leetcode.interview;

import com.leetcode.coderAlgo.Demo2;
import com.work.day5_27.Demo1;

public class Demo20 {

    // 判断给出的字符串是否是一个合法的数值
    /*
    * 正常数值：
    * e之前只需要是正常的数值都行
    * e之后必须是整数
    * */
    public boolean isNumber(String s){
        // 合法的符号 + - e . 数字
        boolean isBefore = true;
        int countSymbol = 0,countD = 0;
        s = s.trim();
        if(s.length()==0) return false;
        for (int i = 0; i < s.length(); i++) {
            // e不可以是在第一个字符的位置
            if(s.charAt(0) == 'e' || s.charAt(i) == ' ') return false;
            if(isBefore && s.charAt(i) == 'e') {
                isBefore = false;
                // 将符号计数清空
                countSymbol = 0;
                countD = 0;
            } else if(!isBefore && s.charAt(i) == 'e') return false;
            else if(s.charAt(i) == '+' || s.charAt(i) == '-') {
                countSymbol ++;
            }else if(s.charAt(i) == '.')
                countD ++;
            else if((Character.isLowerCase(s.charAt(i)) || Character.isUpperCase(s.charAt(i))) && s.charAt(i) != 'e') return false;

            if(countD >= 2 || countSymbol >= 2) return false;

            if(isBefore){
                // + - 只可以在第一位，后面必须有数字
                if(countSymbol == 1 && (i != 0 || i + 1 >= s.length() || !Character.isDigit(s.charAt(i+1)))) return false;
                // . 只可以出现一次 且必须前后都必须有数字
                //if(countD == 1 && (i-1 < 0 || i + 1 >= s.length() || !Character.isDigit(s.charAt(i-1)) || !Character.isDigit(s.charAt(i+1))))
                //return false;
            }else{

                // 不可以出现 .
                if(countD != 0) return false;
                // + - 只可以在第一位，后面必须有数字
                if(countSymbol == 1 && (i-1<0 || i+1 >= s.length() || s.charAt(i-1) != 'e' || !Character.isDigit(s.charAt(i+1))))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Demo20 demo20 = new Demo20();
        System.out.println(demo20.isNumber("0"));
    }
}
