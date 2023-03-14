package com.liuhanze.design_patterns.bridge.demo2;
import com.liuhanze.iutil.log.ILog;

public class HandsetSoftGame extends HandsetSoft{

    @Override
    void run() {
        ILog.LogDebug("HandsetGame run");
    }
}
