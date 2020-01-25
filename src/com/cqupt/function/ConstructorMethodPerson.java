package com.cqupt.function;

@FunctionalInterface
public interface ConstructorMethodPerson{

    // 根据定义的姓名，创建Person对象返回
    Person builderPerson(String name);

}
