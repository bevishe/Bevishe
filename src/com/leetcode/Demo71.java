package com.leetcode;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Classname Demo71
 * @Description TODO
 * @Date 2020/3/28 8:23
 * @Created by Administrator
 */

/*
* 简化路径
*
*
* */


public class Demo71 {
    public static String method(String s){
        String p = "\\\\";
        String[] re = s.split(p);
        for (String s1 : re) {
            System.out.println(s1);
        }

        return " ";
    }

    public static void main(String[] args) {
        String s = method("\\a\\b\\c\\d");
    }

}
