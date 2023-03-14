package com.liuhanze.design_patterns.bridge.demo2;

import com.liuhanze.iutil.log.ILog;

public class HandSetSoftMusic extends HandsetSoft{

    @Override
    void run() {
        ILog.LogDebug("HandSetMusic run");
    }
}
