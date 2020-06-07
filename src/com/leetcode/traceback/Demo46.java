package com.leetcode.traceback;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Demo46
 * @Description TODO
 * @Date 2020/6/7 16:39
 * @Created by Administrator
 */
public class Demo46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> reList = new ArrayList<>();
        if(nums == null || nums.length == 0 )return reList;
        List<Integer> curList = new ArrayList<>();
        int len = nums.length;
        boolean[] used = new boolean[len];
        for (boolean b : used) {
            b = false;
        }
        dfs(reList,curList,0,nums,len,used);
        return reList;
    }




    public void dfs(List<List<Integer>> reList,List<Integer> curList,int depth,int[] nums,int len,boolean[] used){
        if(depth == len){
            reList.add(new ArrayList<>(curList));
            return;
        }
        for (int i = 0; i < len; i++) {
            if(used[i]) continue;
            curList.add(nums[i]);
            used[i] = true;
            dfs(reList,curList,depth+1,nums,len,used);
            curList.remove(curList.size() -1);
            used[i] = false;
        }
    }


}
