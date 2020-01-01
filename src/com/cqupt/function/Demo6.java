package com.cqupt.function;

public class Demo6 {

    // 定义一个方法，参数传递姓名和ConstructorMethodPerson接口
    public void printName(String name,ConstructorMethodPerson constructorMethodPerson){
        Person person = constructorMethodPerson.builderPerson(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        // 调用printName方法，
        new Demo6().printName("jack",(s)->{
            return new Person(s);
        });

        // 使用方法引用的方法
        new Demo6().printName("构造方法",Person::new); // 使用Person类带参构造方法，通过传递的姓名，创造独享
    }
}
