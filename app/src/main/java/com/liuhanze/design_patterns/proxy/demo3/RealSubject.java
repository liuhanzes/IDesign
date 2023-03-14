package com.liuhanze.design_patterns.proxy.demo3;

import com.liuhanze.iutil.log.ILog;

public class RealSubject implements Subject{

    @Override
    public void doSomething() {
        ILog.LogDebug("real subject do something");
    }
}
