package com.liuhanze.design_patterns.bridge.demo1;

import com.liuhanze.iutil.log.ILog;

/**
 * 具体实现
 */
public class ConcreteImplementorA extends Implementor{


    @Override
    void operation() {
        ILog.LogDebug("ConcreteImplementorA operation exec");
    }
}
