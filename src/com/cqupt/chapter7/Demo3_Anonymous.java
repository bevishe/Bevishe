package com.cqupt.chapter7;

import com.cqupt.chapter6.Person;

public class Demo3_Anonymous {
/*
没有类名称的类
new 类名称（）；
注意事项：匿名对象只能使用唯一的一次，下次再用需要不得不在创建一个对象
使用建议：如果确定有一个对象只需要使用唯一的一次，就可以使用匿名对象。
* */
    public static void main(String[] args) {
        // 匿名对象
        new Person().setAge(17);

    }
}
