package com.cqupt.reflaction;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Person{

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo(){
        System.out.println("My name is "+this.name + ";My age is " + String.valueOf(this.age));
    }


    public void print(){
        System.out.println(this.name + "中的非私有方法");
    }

    private void printPri(String name){
        System.out.println(name + "中的私有方法");
    }
}

public class Demo2 {

    // 反射可以获取哪些信息
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class class1 = Class.forName("com.cqupt.reflaction.Person");

        try {
            Person person1 = (Person) class1.newInstance();
            person1.setName("class1");
            person1.setAge(12);
            person1.printInfo();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        // 2.通过反射来获取构造器
        System.out.println("****************************************");
        Class class2 = Class.forName("com.cqupt.reflaction.Person");
        // 获取的有参构造方法
        Constructor constructorArgs = class2.getConstructor(String.class,int.class);
        Person personArgs = (Person) constructorArgs.newInstance("classArgs",12);
        personArgs.printInfo();
        // 获取无参数的构造方法
        Constructor constructorNoArgs = class2.getConstructor();
        Person personNoArgs = (Person) constructorNoArgs.newInstance();
        personNoArgs.printInfo();

        //3.通过反射来获取类中的成员变量
        System.out.println("****************************************");
        Class class3 = Class.forName("com.cqupt.reflaction.Person");
        Person personField = (Person) class3.newInstance();
        // 获取私有成员属性
        Field fieldName = class3.getDeclaredField("name");
        fieldName.setAccessible(true);
        fieldName.set(personField,"通过获取field来赋值的name");
        Field fieldAge = class3.getDeclaredField("age");
        fieldAge.setAccessible(true);
        fieldAge.setInt(personField,12);
        personField.printInfo();

        // 4.通过反射来获取方法并使用
        System.out.println("******************************************");
        Class class4 = Class.forName("com.cqupt.reflaction.Person");
        // 实例化
        Person personMethod = (Person) class4.newInstance();
        Method methodPrint = class4.getMethod("print");
        // 公共的方法
        methodPrint.invoke(personMethod);
        // 私有的方法
        Method methodPrintPri = class4.getDeclaredMethod("printPri", String.class);
        methodPrintPri.setAccessible(true);
        methodPrintPri.invoke(personMethod,"私有方法 ");




    }

}
