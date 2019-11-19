package com.cqupt.serialize;

import java.io.*;

public class Demo1 {

    /*
    *
    *
    * ObjectOutputStream：序列化流
    *   writeObject（）
    * ObjectInputStream：反序列化流
    *   readeObject（）
    *
    * InvalidClassException:
    * 当jvm反序列化对象时，能找到class文件，但是class文件在序列化对象之后发生了修改，那么反序列化操作也会失败，会抛出InvalidClassException异常，原因如下：
    * 1.该类的序列版本号与从流中的读取的类描述的版本号不同
    * 2.该类包含未知的数据类型
    * 3.该类没有可访问的无参数构造方法
    * */

    public static void main(String[] args) {
        // 创建一个Person对象
        Person person = new Person("mary",21);
        // 创建一个序列化流，将person对象存储到文件.person.txt中
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("src\\com\\cqupt\\serialize\\person.txt")));
            objectOutputStream.writeObject(person);
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(objectOutputStream != null) objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 创建一个反序列化流，将person。txt中的person对象读取出来
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(new File("src\\com\\cqupt\\serialize\\person.txt")));
            Object obj = objectInputStream.readObject();
            Person p = (Person)obj;
            System.out.println(p);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
