package com.leetcode.swordOffer;

/**
 * @Classname Demo11
 * @Description TODO
 * @Date 2020/2/18 17:18
 * @Created by Administrator
 */
public class Demo11 {
    // 旋转数组的最小数字


    // 方法1：直接对数组进行遍历
    public static int method1(int[] numbers){
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(min>numbers[i]) min = numbers[i];
        }
        return min;
    }

    // 方法2：
    public static int method2(int[] numbers){
        if(numbers.length == 1) return numbers[0];
        else{
            int firstNum,secondNum ,min = numbers[0];
            for(int i = 0; i < numbers.length - 1; i++) {
                firstNum = numbers[i];
                secondNum = numbers[i+1];
                if(firstNum>secondNum) return secondNum;

            }
            return min;
        }
    }

    // 方法3：使用二分
    // 上面两种算法的时间复杂度都太高O（n），不是最优解
    public static int method3(int[] numbers){
        // 数组中是从小到大的循环数组
        int begin = 0,end = numbers.length - 1,between = (numbers.length/2);
        while(begin<end){

        }
        return 0;
    }


    public static void main(String[] args) {

    }

}
