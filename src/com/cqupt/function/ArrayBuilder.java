package com.cqupt.function;

@FunctionalInterface
public interface ArrayBuilder {

    //定义一个创建int类型数组的方法，参数传递数组的长度
    int[] builderArray(int length);
}
