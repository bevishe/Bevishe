package com.leetcode.swordOffer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

/**
 * @Classname Demo45
 * @Description TODO
 * @Date 2020/4/10 15:33
 * @Created by Administrator
 */
public class Demo45 {

    public String minNumber(int[] nums) {
        // 拼接的策略就是先找除零最小的，都有后续继续比较，0比空字符好，比非零的好
        // 复杂度太高，有问题，

        // 其实这个是一个排序问题，将小的排在前面，大的排在后面
        // 是否可以用递归的思想来解决，每次只解决两个数的排序比
        ArrayList<String> arrayList = new ArrayList<>();
        for (int num : nums) {
            arrayList.add(String.valueOf(num));
        }
        arrayList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int o1Length = o1.length(),o2Lenght = o2.length();
                int curIndex = 0;
                // 覆盖重写Compator接口中的compare函数
                while(o1.charAt(curIndex) == o2.charAt(curIndex) && curIndex + 1 < o1Length && curIndex < o2Lenght){
                    curIndex ++;
                }
                if(curIndex == o1.length()) return -1;
                else if(curIndex == o2.length()) return 1;
                if((int)o1.charAt(curIndex) < (int)o2.charAt(curIndex))
                    return -1;
                else if((int)o1.charAt(curIndex) < (int)o2.charAt(curIndex))
                    return 1;
                else return 0;
            }
        });
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        return "";
    }

    public static void main(String[] args) {
        Demo45 demo45 = new Demo45();
        demo45.minNumber(new int[]{10,23,1,12});
    }
}
