package com.cqupt.stream;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo9 {

    /*
    * 题目：
    * 现有两个ArrayList结合存储队伍当中的多个成员的姓名，要求使用传统的for训练依次进行以下相关操作
    * 1.第一队伍只要名字为三个字的成员姓名，存储到一个新的集合中
    * 2.第一队伍筛选之后只要前三个人；存储到第一集合中去·
    * 3.第二个队伍只要姓张的成员变量；存储到一个新的集合中去
    * 3.2.第二个队伍不要前两个人，存储到新的集合中去
    * 4.将两个队伍合并为一个队伍，存储到一个新的队伍中
    * 5.根据姓名创建Person对象，存储到一个新集合中去
    * 6.打印整个队伍的Person对象信息
    * */


    public static void main(String[] args) {
        // 创建两个队伍姓名的ArrayList集合
        ArrayList<String> listFirst = new ArrayList<>();
        listFirst.add("张三");
        listFirst.add("李四四");
        listFirst.add("王五五");
        listFirst.add("赵六");

        ArrayList<String> listSecond = new ArrayList<>();
        listSecond.add("孙七");
        listSecond.add("张八");
        listSecond.add("王九");
        listSecond.add("李十");

        //1.
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list1.add(listFirst.get(i));
        }
        for (String s : list1) {
            System.out.println(s);
        }

        //2.将姓名为三个字符的存储到新的元素中
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < listFirst.size(); i++) {
            if(listFirst.get(i).length() == 3)
                list2.add(listFirst.get(i));
        }

        //3.第二个arraylist中只要姓张的存储到一个新的集合中去
        ArrayList<String> list3 = new ArrayList<>();
        for (int i = 0; i < listSecond.size(); i++) {
            if(listSecond.get(i).startsWith("张")) list3.add(listSecond.get(i));
        }

        //4.第二个集合中不要前面两个元素，将其他元素存储到集合中去
        ArrayList<String> list4 = new ArrayList<>();
        for (int i = 3; i < listSecond.size(); i++) {
            list4.add(listSecond.get(i));
        }

        //5.将两个arrayList合并为一个list中存储
        ArrayList<String> list5 = new ArrayList<>();
        for (String s : listFirst) {
            list5.add(s);
        }
        for (String s : listSecond) {
            list5.add(s);
        }

        //6。根据姓名创建person对象，存储到一个新的集合中去
        ArrayList<Person> personArrayList = new ArrayList<>();
        for (String s : listFirst) {
            personArrayList.add(new Person(s));
        }
        for (String i : listSecond) {
            personArrayList.add(new Person(i));
        }

        //7.打印personArrayList中集合中的元素
        for (int i = 0; i < personArrayList.size(); i++) {
            System.out.println(personArrayList.get(i));
        }

        method();
    }

    private static void method(){
        // 创建两个队伍姓名的ArrayList集合
        ArrayList<String> listFirst = new ArrayList<>();
        listFirst.add("张三");
        listFirst.add("李四四");
        listFirst.add("王五五");
        listFirst.add("赵六");

        ArrayList<String> listSecond = new ArrayList<>();
        listSecond.add("孙七");
        listSecond.add("张八");
        listSecond.add("王九");
        listSecond.add("李十");
        /*
         * 题目：
         * 现有两个ArrayList结合存储队伍当中的多个成员的姓名，要求使用传统的for训练依次进行以下相关操作
         * 1.第一队伍只要名字为三个字的成员姓名，存储到一个新的集合中
         * 2.第一队伍筛选之后只要前三个人；存储到第一集合中去·
         * 3.第二个队伍只要姓张的成员变量；存储到一个新的集合中去
         * 3.2.第二个队伍不要前两个人，存储到新的集合中去
         * 4.将两个队伍合并为一个队伍，存储到一个新的队伍中
         * 5.根据姓名创建Person对象，存储到一个新集合中去
         * 6.打印整个队伍的Person对象信息
         * */

        ArrayList<String> arrayList1 = (ArrayList<String>) listFirst.stream().filter(s -> s.length()==3).collect(Collectors.toList());
        for (String s : arrayList1) {
            System.out.println(s);
        }

        //2
        System.out.println("*************问题2");
        ArrayList<String> arrayList2 = (ArrayList<String>) listFirst.stream().limit(3).collect(Collectors.toList());
        for (String s : arrayList2) {
            System.out.println(s);
        }

        //3
        System.out.println("*************问题3");
        ArrayList<String> arrayList3 = (ArrayList<String>) listSecond.stream().filter(s -> s.startsWith("张")).collect(Collectors.toList());
        for (String i : arrayList3) {
            System.out.println(i);
        }

        //.4
        System.out.println("*************问题4");
        ArrayList<String> arrayList4 = (ArrayList<String>)Stream.concat(listFirst.stream(),listSecond.stream()).collect(Collectors.toList());
        for (String s: arrayList4) {
            System.out.println(s);
        }

        //5.
        System.out.println("**********问题5");
        ArrayList<Person> personArrayList = (ArrayList<Person>)listFirst.stream().map(s -> new Person(s)).collect(Collectors.toList());
        for (Person person : personArrayList) {
            System.out.println(person);
        }
    }

}
