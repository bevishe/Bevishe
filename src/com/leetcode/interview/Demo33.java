package com.leetcode.interview;

public class Demo33 {


    public int search(int[] nums,int target){
        if(nums == null || nums.length == 0) return -1;
        int re = 0,numsLen = nums.length;
        int low = 0,hight = numsLen -1;
        re = numsLen/2;

        while(low <= hight){
            // 1.判断当前子数组是否是一个完全递增的数组
            int mid = (hight + low)/2;
            if(nums[low] <= nums[hight]){
                // 完全递增，二分法
                if(nums[mid] > target){
                    hight = mid -1;
                }else if(nums[mid] < target){
                    low = mid + 1;
                }else{
                    return mid;
                }
            }else{
                // 不是完全递增的
                // 完全递增，二分法
                // 需要看当前target在mid的前面还是后面
                // 先确定mid的位置
                if(nums[mid] > nums[hight]){
                    if(target > nums[mid])
                        low = mid + 1;
                    else if(target < nums[mid]){
                        if(target < nums[low])
                            low = mid + 1;
                        else if(target > nums[low])
                            hight = mid -1;
                        else return low;
                    }else return mid;
                }else {
                    if(target < nums[mid])
                        hight = mid -1;
                    else if(target > nums[mid]){
                        if(target < nums[hight]){
                            low = mid + 1;
                        }else if(target > nums[hight])
                            hight = mid -1;
                        else return hight;
                    }else return mid;
                }
            }
        }

        return low < hight ? re : -1;
    }

    public static void main(String[] args) {
        Demo33 demo33 = new Demo33();
        System.out.println(demo33.search(new int[]{4,5,6,7,8,1,2,3},8));
    }
}
