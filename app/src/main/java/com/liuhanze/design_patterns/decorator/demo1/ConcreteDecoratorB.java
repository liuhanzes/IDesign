package com.liuhanze.design_patterns.decorator.demo1;

import com.liuhanze.iutil.log.ILog;

class ConcreteDecoratorB extends Decorator{

    @Override
    public void operation() {
        super.operation();
        addBehavior();
        ILog.LogDebug("ConcreteDecoratorB operation exec");
    }

    private void addBehavior(){
        ILog.LogDebug("ConcreteDecoratorB addBehavior exec");
    }
}
