package com.liuhanze.design_patterns.decorator.demo1;

import com.liuhanze.iutil.log.ILog;

/**
 * 具体的装饰类，你要把你最核心的、最原始的、最基本的东西装饰成其他东西
 */
class ConcreteDecoratorA extends Decorator{

    private String  addState="";

    @Override
    public void operation() {
        super.operation();
        addState = "New State";
        ILog.LogDebug("ConcreteDecoratorA operation exec");
    }
}
