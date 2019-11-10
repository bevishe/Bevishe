package com.cqupt.lambda;


import java.util.ArrayList;
import java.util.Comparator;

public class Demo4_Person {

    public static void main(String[] args){

        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person("jack0",12));
        arrayList.add(new Person("jack1",13));
        arrayList.add(new Person("jack2",14));
        arrayList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) { return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(arrayList);

        ArrayList<Person> ay = new ArrayList<>();
        ay.add(new Person("mary0",12));
        ay.add(new Person("mary1",13));
        ay.add(new Person("mary2",14));
        ay.add(new Person("mary3",15));
        ay.sort((p1,p2)->p1.getAge() - p2.getAge());
        System.out.println(ay);
    }
}
