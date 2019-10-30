package com.cqupt.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {
    /*
    java.util.Collections
    * 集合工具类Collections
    * */

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        Collections.addAll(arrayList,"a","b","c");
        System.out.println(arrayList);

        Collections.shuffle(arrayList);
        System.out.println(arrayList);

        // 将集合中元素按照默认的升序排列
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
