package com.liuhanze.design_patterns.decorator.demo1;

import com.liuhanze.iutil.log.ILog;

class ConcreteDecoratorA extends Decorator{

    private String  addState="";

    @Override
    public void operation() {
        super.operation();
        addState = "New State";
        ILog.LogDebug("ConcreteDecoratorA operation exec");
    }
}
