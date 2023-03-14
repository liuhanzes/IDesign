package com.liuhanze.design_patterns.bridge.demo4;

public class UrgencyMessage extends AbstractMessage{

    public UrgencyMessage(MessageImplementor messageImplementor) {
        super(messageImplementor);
    }

    public void sendMessage(String message,String toUser){
        super.sendMessage(message,toUser);
    }

    /**
     * 扩展方法
     * @param messageID
     * @return
     */
    public Object watch(String messageID){
        return null;
    }
}
