package com.leetcode.traceback;

import java.util.ArrayList;
import java.util.List;

public class Demo8_4 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> reList = new ArrayList<>();
        if(nums == null || nums.length == 0 )return reList;
        List<Integer> curList = new ArrayList<>();
        int len = nums.length;
        dfs(reList,curList,0,0,nums,len);
        return reList;
    }


    public void dfs(List<List<Integer>> reList,List<Integer> curList,int depth,int index,int[] nums,int len){
        if(index == len){
            reList.add(new ArrayList<>(curList));
            return;
        }
        reList.add(new ArrayList<>(curList));
        for (int i = index; i < len; i++) {
            curList.add(nums[i]);
            dfs(reList,curList,i+1,i+1,nums,len);
            curList.remove(curList.size() -1);
        }


    }


    // 能不能将所有的回溯问题抽象成一个解空间树的问题，通过遍历这个空间树来实现 

    public static void main(String[] args) {

        Demo8_4 demo8_4 = new Demo8_4();
        List<List<Integer>>  relist= demo8_4.subsets(new int[]{1,2,3});

        for (List<Integer> integers : relist) {
            for (Integer integer : integers) {
                System.out.print(integer+" ");
            }
            System.out.println();
        }
        System.out.println(relist.size());
    }
}
