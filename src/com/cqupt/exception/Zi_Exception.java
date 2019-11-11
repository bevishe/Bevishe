package com.cqupt.exception;

public class Zi_Exception extends Fu_Exception{

    /*
    * 子类重写父类方法是，抛出和父类相同的异常、或者是子类
    * */
    @Override
    public void show01() throws ArrayIndexOutOfBoundsException, ClassCastException {
        super.show01();
    }
}
