package com.leetcode.traceback;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Demo78
 * @Description TODO
 * @Date 2020/6/7 18:23
 * @Created by Administrator
 */
public class Demo78 {


    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> reList = new ArrayList<>();
        if(nums == null || nums.length == 0) return reList;
        List<Integer> curList = new ArrayList<>();
        int len = nums.length;
        dfs(nums,reList,curList,len,0,0);
        return reList;
    }


    public void dfs (int[] nums,List<List<Integer>> reList,List<Integer> curList,int len,int depth,int index){
        if(depth == len){
            reList.add(new ArrayList<>(curList));
            return;
        }
        reList.add(new ArrayList<>(curList));
        for (int i = index; i < len; i++) {
            curList.add(nums[i]);
            dfs(nums,reList,curList,len,depth+1,i+1);
            curList.remove(curList.size()-1);
        }
    }

    public static void main(String[] args) {


    }
}
