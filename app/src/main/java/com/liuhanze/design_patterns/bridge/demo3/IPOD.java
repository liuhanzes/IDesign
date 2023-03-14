package com.liuhanze.design_patterns.bridge.demo3;

import com.liuhanze.iutil.log.ILog;

public class IPOD implements IProduct{

    @Override
    public void beProducted() {
        ILog.LogDebug("ipod 被造出来了");
    }

    @Override
    public void beSelled() {
        ILog.LogDebug("IPOD 被卖掉了");
    }
}
