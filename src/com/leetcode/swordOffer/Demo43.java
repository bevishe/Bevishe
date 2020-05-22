package com.leetcode.swordOffer;

/**
 * @Classname Demo43
 * @Description TODO
 * @Date 2020/4/16 15:25
 * @Created by Administrator
 */
public class Demo43 {


    // 时间复杂度太高
//    public int countDigitOne(int n){
//        int count = 0;
//        // 统计在1-n的里面中1出现的次数，应该是要用找规律的方法
//        /*
//        * 1-9  每一个中0个  1除外
//        * 10 - 99 每10个中有一个 其中第一个有11个
//        * 100 - 999 每
//        * 1000 - 9999 10 * 3
//        * 10000 - 99999 10 * 4
//        * 要是用递归的思想
//        * */
//        count = countDigit(n);
//
//        return count;
//    }
//
//    public int countDigit(int n){
//        if(n<=9) return 1;
//        // 判断是否可以被10整除
//        if(n % 10 == 0){
//            // 需要
//            int count = 0;
//            String temp = String.valueOf(n);
//            for (int i = 0; i < temp.length() -1; i++) {
//                if(temp.charAt(i) == '1') count++;
//            }
//            return count + countDigit(n-1);
//        }else{
//            int nLength = String.valueOf(n).length(),nextN;
//            nextN = (int)(n % Math.pow(10,nLength - 1));
////            System.out.println(n/Math.pow(10,nLength - 1));
//            if((int)(n / Math.pow(10,nLength - 1)) == 1)
//                return countDigit(n - nextN) + countDigit(nextN) + nextN;
//            else
//                return countDigit(n - nextN) + countDigit(nextN);
//        }
//    }





    public static void main(String[] args) {
//        Demo43 demo43 = new Demo43();
//        System.out.println(demo43.countDigitOne(824883294));
    }
}
