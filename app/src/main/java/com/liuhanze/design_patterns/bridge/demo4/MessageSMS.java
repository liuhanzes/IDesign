package com.liuhanze.design_patterns.bridge.demo4;

import com.liuhanze.iutil.log.ILog;

public class MessageSMS implements MessageImplementor{

    @Override
    public void send(String message, String toUser) {
        ILog.LogDebug("使用站内短消息发送消息 message: "+message+" to :"+toUser);
    }
}
