package com.liuhanze.design_patterns.bridge.demo4;

public class CommonMessage extends AbstractMessage{

    public CommonMessage(MessageImplementor messageImplementor) {
        super(messageImplementor);
    }

    public void sendMessage(String message,String toUser){
        super.sendMessage(message,toUser);
    }
}
