package com.nowcoder;


public class Demo5 {

    /*
    * 牛客中错题
    *
    * */

    private static int getValue(){
        int i = 1;
        int a = 2;
        try{// 运行时异常可以不加catch，编译期异常一定要加catch，捕获异常
            i = 4;
        }finally{
            /*
            * 结果应该等于5
            *
            * 如果语句换成i = i++;
            * 结果就会变成4
            * why?
            * i++: temp = i; i = i +1;
            * i = i+1：  temp = i; i = i + 1; i = temp;
            * i = ++i;  i = i +1; temp = i; i = temp;
            * */
            i++;
            return i;
        }
    }

    public static void main(String[] args) {
        int a = 1;
        int b = a++;
        System.out.println(b);
        System.out.println(a);

        int c = 1;
        c = c ++;
        System.out.println(c);
        System.out.println(getValue());
    }
}


