package com.cqupt.set;

import java.util.HashSet;

public class Demo5_Hash {


    public static void main(String[] args){
        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(new Person("jack",12));
        hashSet.add(new Person("jack",12));
        hashSet.add(new Person("mark",12));
        System.out.println(hashSet);
    }
}
