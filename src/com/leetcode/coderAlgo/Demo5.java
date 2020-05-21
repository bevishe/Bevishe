package com.leetcode.coderAlgo;

public class Demo5 {


    /*
    * 一次编辑
    * 要求： second 只比first少一个字符或相等 或 一个字符或者只有一个字符不一样
    * */
    public boolean oneEditAway(String first, String second) {
        if(first.equals(second)|| (first == null && second == null)) return true;
        else if(first == null || second == null) return Math.abs(first.length() - second.length()) <=1 ? true : false;
        if(Math.abs(first.length() - second.length())>=2) return false;
        boolean flag = true;
        if(first.length() < second.length()){
            // 插入一个元素是可行的
            for (int firstIndex = 0,secIndex = 0; firstIndex < first.length();) {
                if(flag && first.charAt(firstIndex) != second.charAt(secIndex)){
                    flag = false;
                    secIndex ++;
                }else if(first.charAt(firstIndex) == second.charAt(secIndex)){
                    firstIndex ++;
                    secIndex++;
                }else return false;
            }
        }else if(first.length() > second.length()){
            // 删除一个元素是可行
            for (int firstIndex = 0,secIndex = 0; secIndex < second.length();) {
                if(flag && first.charAt(firstIndex) != second.charAt(secIndex)){
                    flag = false;
                    firstIndex ++;
                }else if(first.charAt(firstIndex) == second.charAt(secIndex)){
                    firstIndex ++;
                    secIndex++;
                }else {return false;}
            }
        }else{
            // 替换
            for (int firstIndex = 0,secIndex = 0; secIndex < second.length();) {
                if(flag && first.charAt(firstIndex) != second.charAt(secIndex)){
                    flag = false;
                    firstIndex ++;
                    secIndex++;
                }else if(first.charAt(firstIndex) == second.charAt(secIndex)){
                    firstIndex ++;
                    secIndex++;
                }else {return false;}
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
