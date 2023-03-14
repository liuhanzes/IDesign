package com.liuhanze.design_patterns.command.demo1;
import com.liuhanze.iutil.log.ILog;

/**
 * Receiver类，知道如何实施与执行一个与请求相关的操作，任何类都可能作为一个接收者。
 */
public class Receiver {

    public void action(){
        ILog.LogDebug("执行 具体的动作");
    }

}
