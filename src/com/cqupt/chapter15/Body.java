package com.cqupt.chapter15;

public class Body {

    public class Heart{//成员内部类
        public void methodHeart(){
            System.out.println("心脏跳动，内部类方法");
            System.out.println("我叫"+name);
        }
    }

    public void methodBodyHeart(){
        new Heart().methodHeart();
    }

    public Body(String name) {
        this.name = name;
    }

    private String name;

    public void methodBody(){
        System.out.println("外部类的方法！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
