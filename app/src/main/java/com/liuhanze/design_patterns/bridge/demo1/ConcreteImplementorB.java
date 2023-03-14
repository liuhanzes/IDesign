package com.liuhanze.design_patterns.bridge.demo1;

import com.liuhanze.iutil.log.ILog;

/**
 * 具体实现B
 */
public class ConcreteImplementorB extends Implementor{

    @Override
    void operation() {
        ILog.LogDebug("ConcreteImplementorB operation exec");
    }
}
