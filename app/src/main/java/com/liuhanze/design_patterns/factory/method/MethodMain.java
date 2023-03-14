package com.liuhanze.design_patterns.factory.method;

import com.liuhanze.design_patterns.factory.simple.Operation;

/**
 * 工厂方法模式
 * 定义一个用于创建对象的接口，让子类决定实例化哪一个类，工厂方法使一个类的实例化延迟到其子类
 */
public class MethodMain {

    public void operation(){
        IFactory factory = new OperationAddFactory();
        Operation operation = factory.createOperation();
        operation.number1 = 1;
        operation.number2 = 2;
        operation.getResult();
    }

}
