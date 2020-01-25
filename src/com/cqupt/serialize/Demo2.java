package com.cqupt.serialize;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Demo2 {

    /*
    * 序列化集合：
    * 当我们想在文件中保存多个对象的时候，我们可以把多个对象存储到一个集合中，对集合进行序列化操作
    * */



    public static void main(String[] args) {
        // 1.生成4个person对象
        Person p1 = new Person("mary1",11);
        Person p2 = new Person("mary2",12);
        Person p3 = new Person("mary3",13);
        Person p4 = new Person("mary4",14);
        // 2.将四个person对象存储到ArrayLIst中
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(p1);
        arrayList.add(p2);
        arrayList.add(p3);
        arrayList.add(p4);

        // 3.创建序列化流，将结合序列化存储到arrayList.txt文件之中
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("src\\com\\cqupt\\serialize\\arrayList.txt")));
            objectOutputStream.writeObject(arrayList);
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 4.创建反序列化流，将存储到arrayList.txt文件中的arrayList取出来
        ObjectInputStream objectInputStream = null;
        ArrayList<Object> arr = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(new File("src\\com\\cqupt\\serialize\\arrayList.txt")));
            arr= (ArrayList<Object>) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        // 5.对ArrayList中的数据进行遍历
        Iterator<Object> iterator = arr.iterator();
        while(iterator.hasNext()){
            System.out.println((Person)iterator.next());
        }
    }
}
