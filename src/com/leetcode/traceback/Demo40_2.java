package com.leetcode.traceback;

import java.util.*;

public class Demo40_2 {
    private List<Integer> curList = new ArrayList<>();
    private int curSum = 0;
    private List<List<Integer>> reList = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if(candidates == null || candidates.length == 0) return reList;
        Arrays.sort(candidates);

        findList(candidates,target,0);

        return reList;
    }

    public void findList(int[] candidates,int target,int startIndex){
        if(0 == target){
            reList.add(new ArrayList<>(curList));
        }
        for (int i = startIndex; i < candidates.length; i++) {
            if(i > startIndex  && candidates[i] == candidates[i-1]) continue;
            if(target - candidates[i] < 0) break;
            curList.add(candidates[i]);
            findList(candidates,target - candidates[i],i+1);
            curList.remove(curList.size() -1);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("1");
    }

}
