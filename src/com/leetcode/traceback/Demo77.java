package com.leetcode.traceback;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Demo77
 * @Description TODO
 * @Date 2020/6/7 18:10
 * @Created by Administrator
 */
public class Demo77 {


    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> reList = new ArrayList<>();
        if(n <= 0) return reList;
        int[] nums = new int[n];
        boolean[] used = new boolean[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i+1;
            used[i] = false;
        }
        List<Integer> curString = new ArrayList<>();

        dfs(reList,nums,curString,0,0,k,n);
        return reList;
    }



    public void dfs(List<List<Integer>> reList,int[] nums,List<Integer> curList,int index,int depth,int k,int n){
        if(depth == k){
            reList.add(new ArrayList<>(curList));
            return;
        }
        for (int i = index; i < n; i++) {
            curList.add(nums[i]);
            dfs(reList,nums,curList,i+1,depth+1,k,n);
            curList.remove(curList.size()-1);
        }

    }
}
