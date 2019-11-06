package com.cqupt.exception;

public class Demo10_FuZiException {
    /*
    * 如果父类抛出了多个异常，子类重写父类该方法时，抛出和父类相同的异常或者是父类异常的子类或者不抛出异常
    *       S:因为子类是继承父类的，同理子类中的异常对象也应该是继承父类中的异常对象的子类或者是不抛出异常
    *
    * 父类方法没有抛出异常，子类重写父类方法时也不可以抛出异常，此时子类产生该异常，只能捕获该异常，不能声明该异常
    *       S:当父类没有抛出异常的时候，子类不能抛出异常，因为抛出异常之后父类无法处理，所以只可以将出现的异常在子类捕获，然后自己处理
    * */


}

class Fu{
    public void method(){

    }
}

class Zi extends Fu{
    @Override
    public void method(){
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}