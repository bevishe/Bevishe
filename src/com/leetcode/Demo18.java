package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo18 {
    /*
    *给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，
    * 使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
    注意：
    答案中不可以包含重复的四元组。
    示例：
    给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
    满足要求的四元组集合为：
    [
      [-1,  0, 0, 1],
      [-2, -1, 1, 2],
      [-2,  0, 0, 2]
    ]
    *
    * */


    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> reList = new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length==4 && nums[0]+nums[1]+nums[2]+nums[3] ==target){
            reList.add(new ArrayList<Integer>(Arrays.asList(nums[0],nums[1],nums[2],nums[3])));
            return reList;
        }else if(nums.length==4 && nums[0]+nums[1]+nums[2]+nums[3] !=target)
            return reList;
        for(int first = 0;first <nums.length-3;first++){

            for(int second = first+1;second<nums.length-2;second++){
                int third = second + 1,forth = nums.length-1;
                if(second>first+1&&nums[second]==nums[second-1])
                    continue;
                while(third<forth){
                    if(nums[first]+nums[second]+nums[third]+nums[forth] == target){
                        ArrayList<Integer> tempList = new ArrayList<>(Arrays.asList(nums[first],nums[second],nums[third],nums[forth]));
                        reList.add(tempList);
                        while(third<forth--);
                        while(third++<forth);
                    }else if(nums[first]+nums[second]+nums[third]+nums[forth]>target){
                        // 不等于target
                        while(third<--forth&&nums[first]+nums[second]+nums[third]+nums[forth]!=target
                                &&nums[first]+nums[second]+nums[third]+nums[forth]>target);
                        while(++third<forth&&nums[first]+nums[second]+nums[third]+nums[forth]!=target
                                &&nums[first]+nums[second]+nums[third]+nums[forth]<target);
                    }else{
                        while(++third<forth&&nums[first]+nums[second]+nums[third]+nums[forth]!=target
                                &&nums[first]+nums[second]+nums[third]+nums[forth]<target);
                        while(third<--forth&&nums[first]+nums[second]+nums[third]+nums[forth]!=target
                                &&nums[first]+nums[second]+nums[third]+nums[forth]>target);
                    }
                }
            }
        }
        System.out.println(reList);
        return reList;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        fourSum(nums,0);
    }
}
