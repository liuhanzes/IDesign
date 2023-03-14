package com.liuhanze.design_patterns.bridge.demo4;

public class BridgeMain {

    public void main(){

        MessageImplementor email = new MessageEmail();
        MessageImplementor sms = new MessageSMS();

        AbstractMessage commonMessage = new CommonMessage(email);
        commonMessage.sendMessage("普通消息","花花");
        commonMessage = new CommonMessage(sms);
        commonMessage.sendMessage("普通消息","花花");

        AbstractMessage urgency = new UrgencyMessage(email);
        urgency.sendMessage("加急消息","花花");
        urgency = new UrgencyMessage(sms);
        urgency.sendMessage("加急消息","花花");

        MessageImplementor mobile = new MessageMobile();
        AbstractMessage special = new SpecialUrgencyMessage(mobile);
        special.sendMessage("特急消息","花花");
    }
}
