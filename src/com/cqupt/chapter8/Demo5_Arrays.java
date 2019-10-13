package com.cqupt.chapter8;

import java.util.Arrays;

public class Demo5_Arrays {

    //数组工具类Arrays
    // toString(数组)将参数数组变为字符串，【元素1，元素2】

    //public static void sort(数组) ,按照默认升序对数组元素进行排序
    //如果是自定义的类型，那么这个自定义的类需要有Comparable或者Comparator接口的支持
    public static void main(String[] args) {

        int[] array = {1,2,3,4};
        String arrayString = Arrays.toString(array);
        System.out.println(arrayString);

        int[] array1 = {2,1,34,11,21};
        Arrays.sort(array1);
        String array2 = Arrays.toString(array1);
        System.out.println(array2);
    }
}
