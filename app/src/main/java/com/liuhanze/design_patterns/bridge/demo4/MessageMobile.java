package com.liuhanze.design_patterns.bridge.demo4;

import com.liuhanze.iutil.log.ILog;

public class MessageMobile implements MessageImplementor{

    @Override
    public void send(String message, String toUser) {
        ILog.LogDebug("使用手机内部消息发送 message:"+message+" to: "+toUser);
    }
}
