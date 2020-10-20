package com.leetcode.interview;

public class Demo42 {

    // 使用递归的暴力解法
    public int trap(int[] height){

        int re = 0;
        // 接雨水，从下面往上面看
        // 使用递归的方法来做

        int first = 0,index = 0;
        while(first < height.length && height[first] <=0 ) first++;
        if(first == height.length) return 0;
        height[first] = Math.max(0,height[first] -1);
        index = first+1;
        while(index < height.length){
            if(height[index] != 0){
                re += (index - first-1);
                first = index;
            }
            height[index] = Math.max(0,height[index] -1);
            index ++;
        }
        return re + trap(height);
    }

    public static int method(int[] arr){
        //
        int sum = 0;
        int left = 0 ,right = 0;

        while(right < arr.length){
            // 找到开始下降的第一个right


        }
        return 1;
    }


    public static void main(String[] args) {
        Demo42 demo42 = new Demo42();
        System.out.println(demo42.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }

}
