package com.leetcode.traceback;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Classname Demo47_2
 * @Description TODO
 * @Date 2020/6/7 16:46
 * @Created by Administrator
 */
public class Demo47_2 {

    public List<List<Integer>> permuteUnique(int[] nums){
        List<List<Integer>> reList = new ArrayList<>();
        if(nums == null || nums.length == 0 )return reList;
        List<Integer> curList = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);
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
            if(used[i] || (i + 1 < len && nums[i] == nums[i+1]) && used[i+1]) continue;
            curList.add(nums[i]);
            used[i] = true;
            dfs(reList,curList,depth+1,nums,len,used);
            curList.remove(curList.size() -1);
            used[i] = false;
        }
    }



    public static void main(String[] args) {

    }
}
