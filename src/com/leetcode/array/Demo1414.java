package com.leetcode.array;

public class Demo1414 {

    public int findMinFibonacciNumbers(int k){
        int re = 0;
        re = recursive(k);

        return re;
    }

    public int recursive(int curK){
        // 找到符合当前
        int pre= 1,cur =1,temp;
        while(pre< curK && curK > cur){
            temp = cur;
            cur =pre+temp;
            pre = temp;
        }
        if(curK == pre || curK == cur){
            return 1;
        }else {
            return 1 + recursive(curK-pre);
        }

    }

    public static void main(String[] args) {
        Demo1414 demo1414 = new Demo1414();
        int re = demo1414.findMinFibonacciNumbers(19);
        System.out.println(re);

    }

}
