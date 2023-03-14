package com.liuhanze.design_patterns.bridge.demo3;

import com.liuhanze.iutil.log.ILog;

public class HouseCorp extends Corp{

    public HouseCorp(House product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        ILog.LogDebug("house crop 正在赚钱");
    }
}
