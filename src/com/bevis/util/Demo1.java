package com.bevis.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {

    public static void main(String[] args) {



        String s = "\"男\"\t\"1\"\t\"高数\"";
        Pattern pattern = Pattern.compile("^\"(.*?)\"\t\"(.*?)\"\t\"(.*?)\"");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));
        }


//        String str = "北京市(海淀区)(朝阳区)";
//        String paternStr = ".*(?=\\()";
//        Pattern pattern = Pattern.compile(paternStr);
//        Matcher matcher = pattern.matcher(str);
//        if (matcher.find()) {
//            System.out.println(matcher.group(0));
//        }
    }
}
