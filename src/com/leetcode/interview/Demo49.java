package com.leetcode.interview;

import java.lang.reflect.Array;
import java.util.*;

public class Demo49 {


    public static List<List<String>> solution(String[] arr){
        List<List<String>> re = new ArrayList<>();

        HashMap<String,List<String>> hashMap = new HashMap<>();
        for (String s : arr) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String tempString = String.valueOf(chars);
            if(hashMap.containsKey(tempString)){
                ArrayList<String> arrayList = (ArrayList<String>) hashMap.get(tempString);
                arrayList.add(s);
                hashMap.put(tempString,arrayList);
            }else{
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(s);
                hashMap.put(tempString,arrayList);
            }
        }

        Iterator<String> iterator = hashMap.keySet().iterator();
        while(iterator.hasNext()){
            re.add(hashMap.get(iterator.next()));
        }

        return re;
    }



    public static void main(String[] args) {
        Demo49 demo49 = new Demo49();
        List<List<String>> re = demo49.solution(new String[]{"ate","tea","abc"});
    }
}
