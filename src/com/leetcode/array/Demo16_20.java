package com.leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Demo16_20 {


    //  T9键盘
    public List<String> getValidT9Words(String num, String[] words) {
        HashMap<Integer,Character> hashMap = new HashMap<>();
        hashMap.put(2,'a');
        hashMap.put(3,'d');
        hashMap.put(4,'g');
        hashMap.put(5,'j');
        hashMap.put(6,'m');
        hashMap.put(7,'p');
        hashMap.put(8,'t');
        hashMap.put(9,'w');
        List<String> reList = new ArrayList<>();
        for (String word : words) {
            // 解析出每个word对应的数字
            char[] wordChars = word.toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < wordChars.length; i++) {
                int k = 2;
                while (k<9 && hashMap.get(k)<=wordChars[i] && hashMap.get(k+1) < wordChars[i]) k++;
                stringBuilder.append(k);
            }
            if(num.equals(stringBuilder.toString())) reList.add(word);
        }
        return reList;
    }

    public static void main(String[] args) {
        Demo16_20 demo16_20 = new Demo16_20();

        List<String> re = demo16_20.getValidT9Words("8733",new String[]{"tree","used"});
        for (String s : re) {
            System.out.println(s);
        }
    }
}
