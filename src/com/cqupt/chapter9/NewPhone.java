package com.cqupt.chapter9;

public class NewPhone extends Phone {
    @Override
    public void show() {
        super.show();//把父类的show方法拿来重复使用
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}

