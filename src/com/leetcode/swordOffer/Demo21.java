package com.leetcode.swordOffer;

/**
 * @Classname Demo21
 * @Description TODO
 * @Date 2020/4/23 22:59
 * @Created by Administrator
 */
public class Demo21 {
    // 构建前后指针，前指针依次遍历到偶数，后指针依次遍历道奇数，然后交换对应的值，让后继续遍历，知道前指针等于大于后指针停止
    public int[] exchange(int[] nums){
        for (int first = 0,last = nums.length - 1; first < last;) {
            while(first < nums.length && nums[first] % 2 == 1) first++;
            while(last >= 0 && nums[last] % 2 == 0) last --;
            if(first < last){
                int temp = nums[first];
                nums[first] = nums[last];
                nums[last] = temp;
            }else{
                return nums;
            }
        }
        return nums;
    }

    public static void main(String[] args) {

    }
}
