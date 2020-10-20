package com.work.day5_24;

import java.util.ArrayList;

public class Demo3 {

    public static void method(int[] arr,int k){
        ArrayList<int[]> re = new ArrayList();
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == k)
                    re.add(new int[]{arr[i],arr[j]});
            }
        }
        if(re.size() == 0) System.out.println("Not found");
        else{
            for (int[] ints : re) {
                System.out.println(ints[0]+ " " + ints[1]);
            }
        }
    }



    public void method(int a,int b){

    }

    public void method(double a,int b){

    }

    public static void main(String[] args) {
//        method(new int[]{3,2,4},7);
//        Joseph j = new Joseph();
//        System.out.println(j.getResult(100,2));

        double re = Math.pow(7,512);
        System.out.println(re);


    }
}


// 约瑟夫环
class Joseph {
    public int getResult(int n, int m) {
        // write code here
        int res=0;
        for(int i=2;i<=n;i++)
            res=(res+m)%i;
        return res+1;
    }
}