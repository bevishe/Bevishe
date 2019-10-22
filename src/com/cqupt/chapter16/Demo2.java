package com.cqupt.chapter16;


public class Demo2 {
    public static void main(String[] args) {
        Weapon w = new Weapon("123");
        Hero hero = new Hero("jack",w,12);
        System.out.println(hero.getName());
        System.out.println(hero.getWeapon().getCode());
        System.out.println(hero.getAge());
        // 给英雄实现技能接口
        hero.setSkill(new Skill() {
            @Override
            public void skill1() {
                System.out.println("使用技能1进行攻击！");
            }
        });
        hero.getSkill().skill1();
    }
}
