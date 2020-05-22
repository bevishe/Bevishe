package com.leetcode.swordOffer;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;

/**
 * @Classname Demo57_2
 * @Description TODO
 * @Date 2020/4/9 7:58
 * @Created by Administrator
 */
public class Demo57_2 {

    public int[][] findContinuousSequence(int target){
        // 此题可以使用滑动窗口来解决，因为题目所求的解都是紧邻的正整数
        ArrayList<int[]> arrayList = new ArrayList<>();

        // 开始的分解target为count项和
        // 最外层是窗口大小的训练，每一个大小的窗口，都让开始元素从1开始遍历一直遍历到target的一半，target的窗口一般是从2到
        // 可不可以让里外两个循环同时移动
        //
        // 滑动窗口一般设定为左右两个index，若sum小于目标值，则右窗口右移，否者左窗口右移
        int l = 1 , r = 1 , sum = 1;
        for (; l <= r && r < target/2 + 1;) {
            if(sum > target){
                sum -= l;
                l ++;
            }else if(sum < target){
                r ++;
                sum += r;
            }else{
                int count = l;
                ArrayList<Integer> tempArray = new ArrayList<>();
                while(count<=r) tempArray.add(count++);
                int[] tempArr = tempArray.stream().mapToInt(Integer::intValue).toArray();
                arrayList.add(tempArr);
                sum -= l;
                l++;
            }
        }
        // 将结果转变为数组存储输出
        int[][] re = new int[arrayList.size()][];
        for (int i = 0; i < re.length; i++) {
            re[i] = arrayList.get(i);
        }

        return re;
    }


    public static void main(String[] args) {
        Demo57_2 demo57_2 = new Demo57_2();
        int[][] re = demo57_2.findContinuousSequence(87760);
        for (int i = 0; i < re.length; i++) {
            System.out.println(re[i]);
        }
    }
}
