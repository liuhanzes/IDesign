package com.liuhanze.design_patterns.command.demo2;

import com.liuhanze.iutil.log.ILog;

public class Receiver {

    public void action(){
        ILog.LogDebug("执行具体的动作");
    }
}
