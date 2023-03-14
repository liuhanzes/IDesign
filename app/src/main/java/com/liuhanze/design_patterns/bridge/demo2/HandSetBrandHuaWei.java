package com.liuhanze.design_patterns.bridge.demo2;

import com.liuhanze.iutil.log.ILog;

public class HandSetBrandHuaWei extends HandSetBrand{

    @Override
    void run() {
        handsetSoft.run();
        ILog.LogDebug("HandSetBrandHuaWei run");
    }
}
