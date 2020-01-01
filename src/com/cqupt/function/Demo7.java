package com.cqupt.function;

public class Demo7 {

    // 传递长度参数length和arrayBuilder函数式接口
    public void printArray(int length,ArrayBuilder arrayBuilder){
        int[] array = arrayBuilder.builderArray(length);
        System.out.println(array.length);
    }

    public static void main(String[] args) {
        new Demo7().printArray(12,s->new int[s]);
        new Demo7().printArray(12,int[]::new);
    }
}
