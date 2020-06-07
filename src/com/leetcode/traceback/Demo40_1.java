package com.leetcode.traceback;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Demo40_2
 * @Description TODO
 * @Date 2020/5/31 15:10
 * @Created by Administrator
 */
public class Demo40_1 {


    private List<Integer> curList = new ArrayList<>();
    private int curSum = 0;
    private List<List<Integer>> reList = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates == null || candidates.length == 0) return reList;

        findList(candidates,target,0);

        return reList;
    }

    public void findList(int[] candidates,int target,int startIndex){
        if(0 == target){
            reList.add(new ArrayList<>(curList));
        }
        for (int i = startIndex; i < candidates.length; i++) {
            if(target - candidates[i] < 0) continue;
            curList.add(candidates[i]);
            findList(candidates,target - candidates[i],i);
            curList.remove(curList.size() -1);
        }
    }

    public static void main(String[] args) {

    }
}
