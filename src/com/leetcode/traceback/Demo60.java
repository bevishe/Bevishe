package com.leetcode.traceback;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Demo60
 * @Description TODO
 * @Date 2020/6/7 17:25
 * @Created by Administrator
 */
public class Demo60 {


    public String getPermutation(int n, int k) {
        List<String> reList = new ArrayList<>();
        if(n <= 0) return new String();
        int[] nums = new int[n];
        boolean[] used = new boolean[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i+1;
            used[i] = false;
        }
        StringBuilder curString = new StringBuilder();

        dfs(reList,nums,curString,n,0,used,k);
        return reList.get(k-1);
    }

    public void dfs(List<String> reList,int[] nums,StringBuilder curString,int len,int depth,boolean[] used,int k){
        if(depth == len){
            reList.add(new String(curString));

            return;
        }
        for (int i = 0; i < len; i++) {
            if(reList.size() == k) break;
            if(used[i]) continue;
            curString.append(nums[i]);
            used[i] = true;
            dfs(reList,nums,curString,len,depth+1,used,k);
            curString.deleteCharAt(curString.length()-1);
            used[i] = false;
        }
    }


    public static void main(String[] args) {
        Demo60 demo60 = new Demo60();
        String reString = demo60.getPermutation(9,101134);
        System.out.println(reString);
    }
}
