package com.cqupt.exception;

import java.util.Scanner;

public class Test1 {

/*
* 要求：模拟使用注册操作，如果用户已存在，则抛出异常并提示：已经被注册
*
* 分析：
*   1.使用数组保存已经注册过的用户名
*   2.使用Scanner来获取用户输入的注册的用户名
*   3.定义一个方法，对用户输入的中注册的用户名进行检测，
*       遍历数组，获取每一个用户
*       使用获取的用户名和输入的进行比较：
*           true：用户已经存在
*           false: 继续遍历
*       如果循环遍历结束了，还没有重复的，可以使用
* */

    static String[] usernames = {"java","jack","mary"};


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入用户名：");
        String username = scanner.next();
        checkUsername(username);

    }

    public static void checkUsername(String userName){
        for (int i = 0; i < usernames.length; i++) {
            if(userName.equals(usernames[i])){
                try {
                    throw new Demo12_MyException("该用户已经被注册");
                } catch (Demo12_MyException e) {
                    e.printStackTrace();
                    return; // 结束方法
                }
            }
        }
        System.out.println("恭喜你，注册成功");

    }
}

