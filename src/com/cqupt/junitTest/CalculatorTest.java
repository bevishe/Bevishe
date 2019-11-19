package com.cqupt.junitTest;

import com.cqupt.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    @Before
    public void init(){
        System.out.println("init>>>>>>");
    }

    /*
    * 初始化方法：用于资源的申请，所有测试方法在执行之前都会先执行该方法
    * */


    @After
    public void close(){
        System.out.println("end>>>>>>>");
    }
    /*
    * 释放资源的方法：所有测试方法执行完之后，都会自动执行该方法
    * */


    @Test
    public void testAdd(){
        //1.创建对象
        Calculator calculator = new Calculator();
        //2.调用add方法
        int result = calculator.add(1,2);
        //System.out.println(result);
        // 3.断言
        Assert.assertEquals(3,result);
    }

    @Test
    public void testSub(){
        Calculator  calculator = new Calculator();
        int res = calculator.sub(1,2);
        Assert.assertEquals(-1,res);
    }

}
