package com.liuhanze.design_patterns.bridge.demo4;

import com.liuhanze.iutil.log.ILog;

public class SpecialUrgencyMessage extends AbstractMessage{

    public SpecialUrgencyMessage(MessageImplementor messageImplementor) {
        super(messageImplementor);
    }

    public void sendMessage(String message,String toUser){
        super.sendMessage("特急："+message,toUser);
    }

}
