package com.cqupt.reflaction;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface IUserDao{
    void save();
}


class UserDao implements IUserDao{
/*
* 接口实现
* 目标对象，真实角色
* */

    @Override
    public void save() {
        System.out.println("----------已经保存了数据--------------");
    }
}

class UserDaoProxy implements IUserDao{

    // 接受保存目标对象
    private IUserDao target;

    public UserDaoProxy(IUserDao target) {
        this.target = target;
    }

    @Override
    public void save() {
        System.out.println("开始事务");
        target.save();
        System.out.println("提交事务。。。");
    }
}

// 使用动态代理的方法来实现
class DaoProxy implements InvocationHandler{


    private Object taget;

    public DaoProxy(Object taget) {
        this.taget = taget;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(taget,args);
        System.out.println("动态代理结束");
        return null;
    }
}

public class Demo3 {

    public static void main(String[] args) {
        UserDao user = new UserDao();
        UserDaoProxy userDaoProxy = new UserDaoProxy(user);
        userDaoProxy.save();

        // 使用动态代理方法来实现
        InvocationHandler proxy = new DaoProxy(user);
        IUserDao dynamicProxy = (IUserDao) Proxy.newProxyInstance(UserDao.class.getClassLoader(),UserDao.class.getInterfaces(),proxy);
        dynamicProxy.save();

    }
}
