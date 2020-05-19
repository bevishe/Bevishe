package com.nowcoder;

import java.util.*;

/**
 * @Classname Demo2_Dp
 * @Description TODO
 * @Date 2020/3/19 14:30
 * @Created by Administrator
 */
public class Demo2_Dp {

    public static int addArr(int[] arr,int[] p){
        int re = 0;
        for (int i : arr) {
            re += p[i];
        }
        return re;
    }

    public static void countN(int n){
        int[] p = {0,1,5,8,9,10,17,17,20,24,30};
        // 设置状态数组 key 是总长度 value是分割之后的小段长度的数组
        HashMap<Integer,int[]> state = new HashMap<>();
        state.put(0,new int[]{0});
        // 分治算法都是自底向上
        // 从初始状态一直转移到所求的状态n
        for (int i = 1; i <= n; i++) {
            // 定义使用的段长度 l 和 使用的前一个状态索引 index
            int newLength = 1;
            while(i-newLength<0){newLength++;}
            // 遍历分别加上0-10 中的10中的可能动作，加上上一个动作来去当前动作的最佳状态
            for (int index = 1; index < p.length; index++) {
                if(i-index >=0 && p[index] + addArr(state.get(i-index),p) > p[newLength] +addArr(state.get(i-newLength),p)){
                    newLength = index;
                }
            }
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int j = 0; j < state.get(i - newLength).length; j++) {
                arrayList.add(state.get(i-newLength)[j]);
            }
            arrayList.add(newLength);

            int[] newArr = arrayList.stream().mapToInt(Integer::intValue).toArray();
            state.put(i,newArr);
//            state.put(i,new ArrayList(Arrays.asList(state.get(i-newLength),newLength).stream().mapToInt(Integer::intValue)).toArray());
//                                                                    res = arrayList.stream().mapToInt(Integer::intValue).toArray();
        }
        Set<Integer> keySet = state.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while(iterator.hasNext()){
            int[] valueArr = state.get(iterator.next());
            for (int v : valueArr) {
                System.out.print(v+"\t");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        countN(20);
//        addArr(new int[]{0},new int[]{0,12});
    }
}
