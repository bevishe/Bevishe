package com.cqupt.aipSystem;

import java.util.HashMap;
import java.util.Objects;

/**
 * @Classname Demo2
 * @Description TODO
 * @Date 2020/6/27 23:07
 * @Created by Administrator
 */
class Person{
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}


public class Demo2 {

    public static void main(String[] args) {
        HashMap<Person,String> hm = new HashMap<>();
        hm.put(new Person(12,"bevis"),"hello");
        System.out.println(hm.get(new Person(12,"bevis")));
    }


}
