package com.cqupt.exception;
// 自定义异常
public class Demo12_MyException extends Exception{
    public Demo12_MyException() {
        super();
    }

    public Demo12_MyException(String message) {
        super(message);
    }
}
