package com.leetcode.traceback;


import java.util.ArrayList;
import java.util.List;

public class Demo93 {

    public List<String> restoreIpAddresses(String s){
        List<String> reList = new ArrayList<>();
        List<Integer> curIpList = new ArrayList<>();
        if(s == null || s.length() == 0) return new ArrayList<>();
        int len = s.length();
        dfs(s,reList,len,0,curIpList);
        return reList;
    }


    // 递归 + 回溯
    public void dfs(String S,List<String> reList,int len,int startIndex,List<Integer> curIpList){
        if( curIpList.size() > 0 && curIpList.get(curIpList.size() - 1)  > 255) return;
        if(curIpList.size() == 4 && startIndex < len) return;
        if(startIndex == len && curIpList.size() == 4){
            String curIp = listToString(curIpList,".");
            reList.add(curIp);
            return;
        }
        for (int i = startIndex+1; i <= len; i++) {
            // 剪枝
            // 1.后面的位数大于9剪枝
            if(i - startIndex > 3) continue;
            // 当前的前缀有多个零的时候也行
            if(zerosNum(S,startIndex,i)) return;
            curIpList.add(Integer.parseInt(S.substring(startIndex,i)));
            dfs(S,reList,len,i,curIpList);
            curIpList.remove(curIpList.size()-1);

        }
    }

    public boolean zerosNum(String s,int start,int end){
        String newString = s.substring(start,end);
        if(newString.charAt(0) != '0' || end - start <= 1) return false;
        else{
            return true;
        }
    }

    public String listToString(List<Integer> list,String s){
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer integer : list) {
            stringBuilder.append(String.valueOf(integer));
            stringBuilder.append(s);
        }
        return stringBuilder.toString().substring(0,stringBuilder.length()-1);
    }

    public static void main(String[] args) {
        Demo93 demo93 = new Demo93();
        List<String> re = demo93.restoreIpAddresses("25525511135");
        for (String s : re) {
            System.out.println(s);
        }
    }
}
