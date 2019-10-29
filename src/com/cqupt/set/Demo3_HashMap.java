package com.cqupt.set;

public class Demo3_HashMap {

    /*
    * 哈希值：一个十进制的整数，由系统随机给出，（就是对象的地址，是一个逻辑地址，不是实际存储的地址）
    * 在Object类中有一个方法，可以用来获取对象的哈希值
    * int hashCode（）返回对象的哈希码值
    * hashCode方法的源码
    * public native int hashCode()
    * native :代表该方法调用的是本地操作系统的方法
    *
    *
    * 哈希冲突：
    * 两个元素不同，但是两个哈希值相同
    * */

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1==p2);


        // String类的hashCode
        /*
        * String 类重写了Object类的hashCode方法
        * */
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
