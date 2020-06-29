package com.leetcode.string;

import java.util.*;

public class Demo1177 {

    // 构建回文串检测
    /*
    * 1.通过检测子串中元素个数为奇数个的元素个数 除于2就是需要最少改变的次数，可以将原子串变为回文串
    * 时间复杂度过于高，在对于每个子串都需要遍历一遍其中的元素，可以使用hashMap来存储字符，和当前字符出现的次数
    * 2.使用异或操作来前n个的状态和，很巧妙
    * */
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        List<Boolean> reList = new ArrayList<>();
        if(queries.length == 0) return reList;
        int[] newS = new int[s.length()];
        int cur = 0;
        for (int i = 0; i < newS.length; i++) {
            cur ^= (1<<s.charAt(i) - 'a' + 1);
            newS[i] = cur;
        }

        for (int i = 0; i < queries.length; i++) {
            int[] q = queries[i];
            if(q[0] == q[1]){
                reList.add(true);
            }else{
                int status = q[0] == 0 ? newS[q[1]] : newS[q[1]] ^ newS[q[0] - 1];
                int re = 0;
                while(status != 0){
                    if(status % 2 == 1)re ++;
                    status /= 2;
                }
                if(q[2]>= re/2) reList.add(true);
                else reList.add(false);
            }
        }
        return reList;
    }



    public int makeIt(String s){
        if(s.length() == 1) return 0;
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(hashMap.containsKey(ch))
                hashMap.put(ch,hashMap.get(ch)+1);
            else
                hashMap.put(ch,1);
        }
        int re = 0;
        Set<Character> set = hashMap.keySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            if(hashMap.get(iterator.next()) % 2 !=0) re ++;
        }
        return re/2;
    }

    public static void main(String[] args) {
        Demo1177 demo1177 = new Demo1177();
        int[][] a = new int[][]{{3,3,0}};
        String s = "abcda";
        System.out.println(s.substring(3,4));
        List<Boolean> re = demo1177.canMakePaliQueries(s,a);

    }
}
