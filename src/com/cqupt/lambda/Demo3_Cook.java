package com.cqupt.lambda;

public class Demo3_Cook {
    public static void main(String[] args) {

        // 使用lambda表达式来实现
        invokeCook(()->{
            System.out.println("我正在做食物！");
        });
    }

    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}