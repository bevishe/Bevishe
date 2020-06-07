package com.leetcode.recursive;

import java.util.ArrayList;
import java.util.List;

public class Demo16_11 {

    private List<Integer> re = new ArrayList();
    public int[] divingBoard(int shorter, int longer, int k) {
        if(k == 0) return new int[0];
        if(shorter == longer) return new int[]{shorter*k};
        getTheLength(k,shorter,longer,k);
        return re.stream().mapToInt(Integer::intValue).toArray();
    }

    public void getTheLength(int countOfShort,int shorter,int longer,int k){
        if(countOfShort == -1) return;
        re.add(countOfShort*shorter+(k-countOfShort)*longer);
        getTheLength(countOfShort-1,shorter,longer,k);
    }

    public static void main(String[] args) {
        System.out.println(979*1118596 < Integer.MAX_VALUE);
    }
}
