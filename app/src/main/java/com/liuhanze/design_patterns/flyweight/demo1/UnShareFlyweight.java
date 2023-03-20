package com.liuhanze.design_patterns.flyweight.demo1;

import com.liuhanze.iutil.log.ILog;

/**
 * UnsharedConcreteFlyweight是指那些不需要共享的Flyweight子类。因为Flyweight接口共享成为可能，但它并不强制共享。
 */
class UnShareFlyweight implements Flyweight{

    @Override
    public void operation(String extendState) {
        ILog.LogDebug("un share Fly : "+extendState);
    }
}
