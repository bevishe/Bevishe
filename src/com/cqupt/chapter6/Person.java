package com.cqupt.chapter6;
/*
* 定义person的年龄时，无法阻止不合理的数值被设置进来
*
* 使用private关键字来修饰，
* 那么本累当中仍然可以任意随意访问，但是超出了本类不可以直接访问
* */
public class Person {

    String name;

    public boolean isMeal() {
        return meal;
    }

    public void setMeal(boolean meal) {
        this.meal = meal;
    }

    private boolean meal;


    public int getAge() {
        return age;
    }

    private int age;

    public void setAge(int age) {
        if (age >=0 && age <100){
            this.age = age;
        }else {
            System.out.println("数据不合理！");
        }

    }

    public void show(){
        System.out.println(name);
        System.out.println(age);
    }
}
