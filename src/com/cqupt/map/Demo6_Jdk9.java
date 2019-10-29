package com.cqupt.map;

public class Demo6_Jdk9 {
    /*
    *
    * 在jdk9中
    * list，set，map接口：里面增加了一个新特性，一个静态的方法of，可以给集合一次性添加多个元素
    * 使用前提：
    *   当集合中存储的元素的个数已经确定了，不在改变时使用
    * 注意：
    *   1.of方法只适用于lsit，set，map接口，不适用于接口的实现类
    *   2.of方法的返回值是一个不能改变的集合，集合不能再使用add或者是put方法来添加元素，会抛出异常
    *   3.set接口和map接口在调用of方法的时候不可以有重复的元素，否则会抛出异常
    * */
    public static void main(String[] args) {

    }
}
