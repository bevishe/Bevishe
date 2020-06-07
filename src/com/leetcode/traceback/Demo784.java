package com.leetcode.traceback;


import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Demo784
 * @Description TODO
 * @Date 2020/6/2 20:20
 * @Created by Administrator
 */
public class Demo784 {

    private List<String> reList = new ArrayList<>();
    public List<String> letterCasePermutation(String S) {

        S.toLowerCase();
        List<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            if(Character.isLowerCase(S.charAt(i)) || Character.isUpperCase(S.charAt(i)))
                indexList.add(i);
        }
        System.out.println(indexList.size());
        dfs(indexList,0,new StringBuilder(S));
        return reList;
    }

    public void dfs(List<Integer> indexList,int deep,StringBuilder S){

        if(deep >= indexList.size()) {
            String temp = new String(S);
            reList.add(temp);
            return;
        }
        up(S,indexList.get(deep));
        dfs(indexList,deep+1,S);
        low(S,indexList.get(deep));
        dfs(indexList,deep+1,S);
    }

    public void up(StringBuilder stringBuilder,int x){
        stringBuilder.replace(x,x+1,String.valueOf(Character.toUpperCase(stringBuilder.charAt(x))));
    }

    public void low(StringBuilder stringBuilder,int x){
        stringBuilder.replace(x,x+1,String.valueOf(Character.toLowerCase(stringBuilder.charAt(x))));
    }

    public static void main(String[] args) {
        Demo784 demo784 = new Demo784();
        List<String> re = demo784.letterCasePermutation("1a2b");
        for (String s : re) {
            System.out.println(s);
        }

    }
}
