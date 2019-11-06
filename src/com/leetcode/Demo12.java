package com.leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class Demo12 {

    // 整数转罗马字

    /*
    * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。

    通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。
    * 数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。
    * 同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：

    I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
    X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
    C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
    给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内。

    * */
    public static String stringMulInt(int i,String s){
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < i; j++) {
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }

    public static String intToRoman(int num) {
        StringBuilder str= new StringBuilder();
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"I");
        hashMap.put(4,"IV");
        hashMap.put(5,"V");
        hashMap.put(9,"IX");
        hashMap.put(10,"X");
        hashMap.put(40,"XL");
        hashMap.put(50,"L");
        hashMap.put(90,"XC");
        hashMap.put(100,"C");
        hashMap.put(400,"CD");
        hashMap.put(500,"D");
        hashMap.put(900,"CM");
        hashMap.put(1000,"M");

        Integer[] l =  {1,4,5,9,10,40,50,90,100,400,500,900,1000};

        int l_index = l.length-1;
        int l_length = l.length;
        int mod = num % l[l_index];
        num = num / l[l_index];
        while(l_index != -1 || mod != 0 || num !=0){
            if(num!=0){
                String str_temp = stringMulInt(num,hashMap.get(l[l_index]));
                str.append(str_temp);
                l_index --;
                num = mod;

            } else{// num == 0
                // 判断 mod是否为零
                if(mod == 0){
                    break;
                }else{
                    num = mod;
                    l_index --;
                }
            }
            if(l_index == -1){
                break;
            }
            mod = num % l[l_index];
            num = num / l[l_index];
        }

        return str.toString();
    }

    public static void main(String[] args) {
        String s = intToRoman(98);
        System.out.println(s);
        System.out.println();
    }
}
