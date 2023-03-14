package com.liuhanze.design_patterns.proxy.demo3;

import com.liuhanze.iutil.log.ILog;

/**
 * 前置通知
 */
public class BeforeAdvice implements IAdvice{

    @Override
    public void advice() {
        ILog.LogDebug("我是前置通知，我被执行了");
    }
}
