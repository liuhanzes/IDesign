package com.liuhanze.design_patterns.factory.simple;

/**
 * 简单工厂模式
 */
public class SimpleMain {

    public void operation(){
        Operation op = SimpleFactory.createOperation("+");
        op.number1 = 1;
        op.number2 = 2;
        op.getResult();
    }

}
