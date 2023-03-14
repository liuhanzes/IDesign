package com.liuhanze.design_patterns.strategy.demo1;

import com.liuhanze.iutil.log.ILog;

/**
 * 具体算法实现C
 */
public class ConcreteStrategyC implements IStrategy{

    @Override
    public void algorithmInterface() {
        ILog.LogDebug("具体算法实现C");
    }
}
