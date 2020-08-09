package com.nowcoder.hj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public abstract class TestAbs implements Test,Test1{


    public static void main(String[] args){

        Scanner sca = new Scanner(System.in);
        System.out.println(" helllo ");
        ArrayList<String[]> arrrayList = new ArrayList();
        while(sca.hasNextLine()){
            String[] curStrArr = sca.nextLine().trim().split(" ");
            //Arrays.sort(curStrArr);
            arrrayList.add(curStrArr);
        }

        int i = 0;
        while(i<arrrayList.size()){
            Arrays.sort(arrrayList.get(i));
            for(String s:arrrayList.get(i)){
                System.out.print(s);
            }
            System.out.println();
            i++;
        }
    }
}
