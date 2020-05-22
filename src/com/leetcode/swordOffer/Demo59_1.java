package com.leetcode.swordOffer;

import java.util.LinkedList;

/**
 * @Date 2020/4/8 15:24
 * @Created by Administrator
 */
public class Demo59_1 {

    public int[] maxSlidingWindow(int[] nums,int k){
       if(nums == null) return null;
       else if(nums.length == 0) return new int[0];
       if(k == 1) return nums;
       // 正常情况下面
       int[] re = new int[nums.length - k + 1];
       // 使用单调双向队列
        LinkedList<Integer> dequeue = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            //当当前的元素大于当前队尾元素的时候，先将队尾元素删去
            while(!dequeue.isEmpty() && nums[i] >= nums[dequeue.peekLast()]){
                dequeue.pollLast();
            }

            // 正常情况下面将元素直接添加到队尾
            dequeue.addLast(i);

            // 当滑动窗口已经略过了队列中头部的元素，则将头部元素弹出，判断当前的队首元素是否在当前的活动窗口里面，通过索引
            while(dequeue.peekFirst() < i - k + 1) dequeue.pollFirst();

            // 当当前位置已经进入到第一滑动窗口里面，可以开始选定当前窗口下面的最大值
            if(i>=k-1){
                re[i-k+1] = nums[dequeue.peekFirst()];
            }
        }

       return re;
    }

    // 双向单调队列
    /*
    * 特点：
    * 1。双向对列是队首队尾都可以添加删除元素
    * 2.单调的双向对列，总是让队首的元素大于队尾的元素，这样队首的元素就是队列中的最大值
    * 3.同时在进队列的时候，若当前进队元素大于队尾元素，就需要将队尾元素删除，所以也就保证了从队首到队尾的元素，队首元素总是在当前元素之前的
    *   这也时保证了活动窗口的需要
    *
    * 注释事项：
    * LinkedList的使用
    * 1.当普通队列使用的时候
    * 用 pop push 方法
    * 2.当双向队列使用的时候
    * 用pollFirst pollLast addLast 方法
    * 两种方法不可以混用，若混用会出现混乱，达不到想要的功能
    * */

    public static void main(String[] args) {
        Demo59_1 demo59_1 = new Demo59_1();
        int[] arr = demo59_1.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7,},3);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
