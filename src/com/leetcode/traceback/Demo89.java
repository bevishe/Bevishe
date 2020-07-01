package com.leetcode.traceback;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Demo89
 * @Description TODO
 * @Date 2020/6/7 19:38
 * @Created by Administrator
 */
public class Demo89 {

    public List<Integer> grayCode(int n){
        List<Integer> reList = new ArrayList<>();
        if(n<=0) return reList;
        StringBuilder curString = new StringBuilder();
        int[] nums = new int[]{0,1};
        dfs(reList,curString,nums,0,n);
        return reList;
    }

    public void dfs(List<Integer> reList,StringBuilder curString,int[] nums,int depth,int len){
        if(depth == len){
            int re = stringToInt(curString);
            reList.add(re);
            return;
        }
        for (int i = 0; i < len; i++) {
            curString.append(nums[i]);
            dfs(reList,curString,nums,depth+1,len);
            curString.deleteCharAt(curString.length() -1);
        }
    }

    public int stringToInt(StringBuilder curString){
        int re = 0,index = 0;
        while(index < curString.length()){
            re += Integer.parseInt(curString.substring(index,index+1));
            System.out.println(re);
            re *= 2;
            index ++;
        }
        return re/2;
    }

    public static void main(String[] args) {
        Demo89 demo89 = new Demo89();
        int re = demo89.stringToInt(new StringBuilder("11"));
    }
}
