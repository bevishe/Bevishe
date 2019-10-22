package com.cqupt.apiObject;

import java.util.Objects;

public class Demo3_Equal {
    private String name;
    private int age;

    public Demo3_Equal(String name, int age) {
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

//    @Override
//    public boolean equals(Object obj) {
//        //传递的参数是this本身，直接返回true提高效率
//        if(obj==this) return true;
//
//        if(obj==null) return false;
//        if(obj instanceof Demo3_Equal){
//            if(this.name.equals(((Demo3_Equal)obj).name))
//                return true;
//            else
//                return false;
//        }
//        else return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //使用反射技术，判断o是否是Demo3_Equal类型的，等效于o instansof Demo3_Equal
        if (o == null || getClass() != o.getClass()) return false;
        Demo3_Equal that = (Demo3_Equal) o;
        return age == that.age &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
