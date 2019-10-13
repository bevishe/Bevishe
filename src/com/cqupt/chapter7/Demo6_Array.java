package com.cqupt.chapter7;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Demo6_Array {
    //定义一个数组，用来存储一个person对象

    //数组有一个缺点，一旦创建，程序运行期间长度不可以发生改变
    public static void main(String[] args) {
        Person[] array = new Person[3];

        Person one = new Person("p1",11);
        Person two = new Person("p2",12);
        Person three = new Person("p3",13);

        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }

}
