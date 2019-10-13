package com.cqupt.chapter9;

public class Demo3 {
    /*
    *局部变量：直接写成员
    * 本类的成员变量：this.
    * 父类的成员变量：super.
    *
    * 对于子父类重名的成员方法，创建的对象是谁，就优先用谁，如果没有则向上找
    * 注意：
    * 无论是成员方法还是成员变量，如果没有都是向上找父类，绝对不会向下找子类的
    * */
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.mehtod();
        zi.methodC();
    }
}
