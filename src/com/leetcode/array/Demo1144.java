package com.leetcode.array;

public class Demo1144 {


    public int movesToMakeZigzag(int[] nums){
        if(nums == null || nums.length == 0 || nums.length == 1)
            return 0;
        int minCount = 0;

        // 当first为正数时的最小数
        // 当second为正数的最小数
        int firstCount = 0 ,secondCount = 0;
        // 当第一个数比第二个数小的时候，变换的次数记为firstCount
        for (int i = 0; i < nums.length - 1; i++) {
            if(i % 2 ==0){
                // 总是对奇数位置进行操作
                if(i == 0 && nums[i] >= nums[i+1])
                    firstCount += (nums[i+1] - nums[i] + 1);
                else if(i >= 2 && (nums[i] >= nums[i-1] || nums[i] >= nums[i+1])){
                    firstCount += (Math.max(nums[i] - nums[i-1],nums[i]-nums[i+1]) +1);
                }
            }
        }

        for (int i = 0; i < nums.length -1; i++) {
            if(i%2 != 0){
                //总是对偶数的地方进行操作
                if(nums[i] >= nums[i-1] || nums[i] >= nums[i+1])
                    secondCount += (Math.max(nums[i] - nums[i-1],nums[i] - nums[i+1])+1);
            }
        }
        if(nums.length > 2 && nums.length % 2 ==0){
            if(nums[nums.length - 1] >= nums[nums.length - 2])
                firstCount += (nums[nums.length - 1] - nums[nums.length -2] + 1 );
        }else if(nums.length > 2 && nums.length % 2 != 0){
            if(nums[nums.length - 1] >= nums[nums.length -2])
                secondCount += (nums[nums.length - 1] - nums[nums.length -2] + 1 );
        }

        minCount = Math.min(firstCount,secondCount);
        return minCount;

    }

    public static void main(String[] args) {

    }
}
