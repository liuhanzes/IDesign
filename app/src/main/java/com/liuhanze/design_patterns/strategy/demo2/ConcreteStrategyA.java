package com.liuhanze.design_patterns.strategy.demo2;

import com.liuhanze.iutil.log.ILog;

/**
 * 具体算法实现A
 */
public class ConcreteStrategyA implements IStrategy {

    @Override
    public void algorithmInterface() {
        ILog.LogDebug("具体算法实现A。。。。");
    }
}
