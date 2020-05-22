package com.leetcode.swordOffer;


/**
 * @Classname Demo44
 * @Description TODO
 * @Date 2020/4/14 21:57
 * @Created by Administrator
 */
public class Demo44 {

    public int findNthDigit(int n){
        // 直接暴力的方法，遍历
        int count = 0,curNum = 0;
        // 当前字数小于n
        while (count < n){
            curNum ++;
            count += String.valueOf(curNum).length();
        }
        int curNumLength = String.valueOf(curNum).length();
        System.out.println(String.valueOf(curNum).charAt(0));
        System.out.println(Character.valueOf('3'));
        System.out.println(curNumLength - 1 - count + n);
        System.out.println(Character.valueOf("3".charAt(0)));
        System.out.println(String.valueOf(curNum).charAt(curNumLength -1 - count + n));
        return String.valueOf(curNum).charAt(curNumLength -1 - count + n);

        /*
        * 为何前面的都是输出字符本身转换为的int值
        * 而后面是输出的字符对于的ascii值的int表示
        *
        * */
    }

    public static void main(String[] args) {
        Demo44 demo44 = new Demo44();
//        System.out.println(demo44.findNthDigit(3));
        char a = '1';
        int b = 1;
        System.out.println(a);
        System.out.println(Character.valueOf(a));
        System.out.println();
    }


}
