package com.liuhanze.design_patterns.bridge.demo4;

public abstract class AbstractMessage {

    protected  MessageImplementor implementor;

    public AbstractMessage(MessageImplementor messageImplementor){
        this.implementor = messageImplementor;
    }

    public void sendMessage(String message,String toUser){
        implementor.send(message,toUser);
    }
}
