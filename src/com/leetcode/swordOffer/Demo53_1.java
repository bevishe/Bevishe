package com.leetcode.swordOffer;

/**
 * @Classname Demo53_1
 * @Description TODO
 * @Date 2020/4/9 17:08
 * @Created by Administrator
 */
public class Demo53_1 {

    // 使用了前后指针，或者使用二分法，对左边不断的做二分法，得到的坐标就是开始的坐标，然后对右边不断做二分，得到的就是最右边target的坐标，当不存在是，坐标应该重合，
    // 取消了二分法中找到元素return index，而是只要保证，在二分钟left 《= right，最后left，right就会重合
    public int search(int[] nums,int target){
        if(nums == null || nums.length == 0) return 0;
        int i=0,j=nums.length - 1;
        if(nums[i]>target) return 0;
        if(nums[j]<target) return 0;
        // 使用前后指针进行搜索
        for (;i<j;){
            if(nums[i]<target) i++;
            if(nums[j]>target) j--;
            if(nums[i] == target && nums[j] == target) return j - i + 1;
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
