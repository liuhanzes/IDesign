package com.liuhanze.design_patterns.flyweight.demo3;

import com.liuhanze.iutil.log.ILog;

/**
 * UnsharedConcreteFlyweight是指那些不需要共享的Flyweight子类。因为Flyweight接口共享成为可能，但它并不强制共享。
 * 不存在外部状态或者安全要求（如线程安全）不能够使用共享技术的对象，该对象一般不会出现在享元工厂中。
 */
class UnShareFlyweight extends Flyweight {

    public UnShareFlyweight(String extendState){
        super(extendState);
    }

    @Override
    public void operation(String extendState) {
        ILog.LogDebug("un share Fly : "+extendState);
    }
}
