package com.leetcode.array;

public class Demo1343 {

    // 回溯
    public int numbOfSubarrays(int[] arr,int k,int threshold){
        int re = revires(k*threshold,arr,0,0,k);
        return re;
    }

    public int revires(int sum,int[] arr,int curIndex,int deep,int k){
        if(deep == k && sum <= 0) {
            return 1;
        }else if(deep >=k){
            return 0;
        }

        for (int i = curIndex; i < arr.length; i++) {
            // 注意重复的需要剪枝操作
            if(i>curIndex && arr[i] == arr[i-1]) continue;

            sum -= arr[i];
            revires(sum,arr,i+1,deep+1,k);
            sum += arr[i];
        }
        // todo
        return 0;
    }



    public static void main(String[] args) {
        Demo1343 demo1343 = new Demo1343();
        System.out.println(demo1343.numbOfSubarrays(new int[]{2,2,2,2,5,5,5,8},3,4));
    }

}
