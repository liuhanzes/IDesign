package com.liuhanze.design_patterns.bridge.demo3;

import com.liuhanze.iutil.log.ILog;

public class House implements IProduct {


    @Override
    public void beProducted() {
        ILog.LogDebug("房子被造出来了");
    }

    @Override
    public void beSelled() {
        ILog.LogDebug("房子被卖掉了");
    }
}
