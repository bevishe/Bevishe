package com.work.day5_24;

/**
 * @Classname Demo2
 * @Description TODO
 * @Date 2020/5/31 13:48
 * @Created by Administrator
 */
public class Demo2 {

    public int soulution(int[] nums, int k) {
        // 将数组分成k个不相交的子数组，使他们的和加起来最大
        int[] dp = new int[nums.length + 1];  // dp【i】 表示将有i个子数组时的最大和
        // 初始化dp数组
        dp[0] = 0;
        return 0;
    }

    /**
     * 通过二分法来求最大值
     */
    public int max(int[] nums, int startIndex, int k) {
        int max = nums[0], tmp = 0;
        if (k == 0 || startIndex >= nums.length) return 0;
        int re = nums[startIndex], cur = nums[startIndex];
        for (int i = startIndex + 1; i < nums.length; i++) {
            cur = cur > 0 ? cur + nums[i] : nums[i];
            if (re < cur) {
                re = cur;
                tmp = re + max(nums, i + 1, k - 1);
                max = Math.max(max, tmp);
            }
        }
        return max;
    }

    public static void main(String[] args) {
//        Demo2 demo2 = new Demo2();
//        System.out.println(demo2.max(new int[]{1,2,-1,3},0,2));
        System.out.println("" + 'b' + 1);

    }
}
