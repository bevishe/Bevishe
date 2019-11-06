package com.leetcode;


import java.util.*;

public class Demo15 {
    /*
    *
    *给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
    注意：答案中不可以包含重复的三元组。
    例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
    满足要求的三元组集合为：
    [
      [-1, 0, 1],
      [-1, -1, 2]
    ]

    * */

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int first=0,second,third=nums.length-1;
        int sumFirstSecond = 0;

        for (; first < nums.length-2; first++) {
            for (second = first+1; second < nums.length-1; second++) {

                third = nums.length - 1;
                sumFirstSecond = nums[first] + nums[second];

                // 判断是否可以a+b+c=0
                while(sumFirstSecond <=0){
                    for(;third>second;third--){
                        if(sumFirstSecond+nums[third] == 0){
                            ArrayList<Integer> temp_list = new ArrayList<>();
                            temp_list.add(nums[first]);
                            temp_list.add(nums[second]);
                            temp_list.add(nums[third]);

                            list.add(temp_list);
                            break;
                        }
                    }// [[-4, -2, 6], [-4, 0, 4], [-4, 1, 3], [-4, 2, 2], [-2, -2, 4], [-2, 0, 2], [-2, -2, 4], [-2, 0, 2]]
                    break;
                }
            }
        }

        list.sort(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                for (int i = 0; i < o1.size(); i++) {
                    if(o1.get(i) != o2.get(i)){
                        return o1.get(i) - o2.get(i);
                    }
                }
                return o1.get(0) - o2.get(0);
            }
        });
        System.out.println(list);
        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i).toString().equals(list.get(i+1).toString())){
                list.remove(i);
                i --;
            }
        }
        System.out.println(list);
        return list;
    }

    public static List<List<Integer>> threeSum2(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int k = 0; k < nums.length - 2; k++){
            if(nums[k] > 0) break;
            if(k > 0 && nums[k] == nums[k - 1]) continue;
            int i = k + 1, j = nums.length - 1;
            while(i < j){
                int sum = nums[k] + nums[i] + nums[j];
                if(sum < 0){
                    while(i < j && nums[i] == nums[++i]);
                } else if (sum > 0) {
                    while(i < j && nums[j] == nums[--j]);
                } else {
                    res.add(new ArrayList<Integer>(Arrays.asList(nums[k], nums[i], nums[j])));
                    while(i < j && nums[i] == nums[++i]);
                    while(i < j && nums[j] == nums[--j]);
                }
            }
        }
        return res;
    }

    public static List<List<Integer>> method(int[] nums){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        int first,second,third,sumThree;
        for (first = 0; first < nums.length; first++) {
            if(nums[first] > 0){
                break;
            }else if(first > 0 && nums[first] == nums[first-1]){
                continue;
            }else{
                second = first + 1;
                third = nums.length -1;
                while(second < third){
                    sumThree = nums[first] + nums[second] +nums[third];
                    if(sumThree>0){
                        while(second<third&&nums[third]==nums[--third]);
                    }else if(sumThree<0){
                        while(second<third&&nums[second]==nums[++second]);
                    }else{
                        res.add(new ArrayList<Integer>(Arrays.asList(nums[first],nums[second],nums[third])));
                        while(second<third&&nums[second]==nums[++second]);
                        while(second<third&&nums[third]==nums[--third]);
                    }

                }

            }

        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        Arrays.sort(nums);
        for (int num : nums) {
            System.out.print(num+" ");
        }
        System.out.println();
        threeSum(nums);


    }

}
