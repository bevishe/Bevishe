package com.jvm;

/**
 * @Classname javaVMStackSOF
 * @Description TODO
 * @Date 2020/3/3 16:53
 * @Created by Administrator
 */
public class javaVMStackSOF {

    private int stackLength = 1;

    public void stackLeak(){
        stackLength ++;
        stackLeak();
    }

    public static void main(String[] args) {
        javaVMStackSOF javaVMStackSOF = new javaVMStackSOF();
        try{
           javaVMStackSOF.stackLeak();
        }catch (Throwable throwable){
            System.out.println("stackLeng:"+javaVMStackSOF.stackLength);
            throw throwable;
        }
    }
}
