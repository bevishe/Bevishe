package com.leetcode.traceback;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo15 {

    // 三数之和
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> reList = new ArrayList<>();
        List<Integer> curList = new ArrayList<>();
        Arrays.sort(nums);
        trace(nums,reList,0,0,0,curList);
        return reList;
    }

    public void trace(int[] nums,List<List<Integer>> reList,int curCount,int curIndex,int curSum,List<Integer> curList){

        // 终止条件
        if(curCount == 3 && curSum == 0){
            reList.add(new ArrayList<>(curList));
            return;
        }

        for (int i = curIndex; i < nums.length; i++) {
            // 会把三个零的情况也包含进去
            if((curCount==0 && nums[i]>0) || (curCount== 3 && curSum>0)) break;
            if(curSum>0 && nums[i]>=0) break;
            if(curCount >= 3) return;
            // 剪枝除去重复的
            if(i>curIndex && nums[i] == nums[i-1])
                continue;

            curList.add(nums[i]);
            trace(nums,reList,curCount+1,i+1,curSum+nums[i],curList);
            curList.remove(curList.size() -1);
        }

    }
    public static void main(String[] args) {
        Demo15 demo15 = new Demo15();
        List<List<Integer>> reList = demo15.threeSum(new int[]{-2,0,1,1,2});
        for (List<Integer> integers : reList) {
            for (Integer integer : integers) {
                System.out.println(integer);
            }
            System.out.println();
        }
    }
}
