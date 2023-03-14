package com.liuhanze.design_patterns.mediator.demo1;

import com.liuhanze.iutil.log.ILog;

public class ConcreteColleague1 extends Colleague{

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMessage(String message) {
        ILog.LogDebug("同事1发送信息："+message);
        mediator.sendMessage(message,this);
    }

    @Override
    public void notify(String message){
        ILog.LogDebug("同事1收到信息："+message);
    }


}
