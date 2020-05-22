package com.leetcode.swordOffer;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Date 2020/4/8 18:50
 * @Created by Administrator
 */
public class Demo58_1 {

    public String reverseWords(String s){
        if(s == null) return s;
        // 可以将其中的小字符创依次放入到stack中，然后依次出栈再拼接起来

        Stack<String> stack = new Stack<>();
        // 设定标志flag 初始为0，找到单词的开头记为1，找到单词的末尾记为2，同时将单词入栈，将flag重置为0
        Pattern pattern = Pattern.compile("\\S+");
        Matcher matcher = pattern.matcher(s);
        while(matcher.find()){
            String t = matcher.group();
            System.out.println(t);
            stack.add(t);
        }

        //
        StringBuilder reString = new StringBuilder();
        while (!stack.isEmpty()){
            if(stack.size() == 1)
                reString.append(stack.pop());
            else
                reString.append(stack.pop()+" ");
        }
        return reString.toString();
    }


    public static void main(String[] args) {
        Demo58_1   demo58_1 = new Demo58_1();
        System.out.println(demo58_1.reverseWords("hello are  you ! tet."));
    }
}
