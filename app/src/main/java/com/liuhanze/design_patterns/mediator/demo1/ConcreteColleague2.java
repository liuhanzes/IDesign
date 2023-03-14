package com.liuhanze.design_patterns.mediator.demo1;
import com.liuhanze.iutil.log.ILog;

public class ConcreteColleague2 extends Colleague{

    public ConcreteColleague2(Mediator mediator){
        super(mediator);
    }

    @Override
    void sendMessage(String message) {
        ILog.LogDebug("同事2发送信息："+message);
        mediator.sendMessage(message,this);
    }

    @Override
    void notify(String message) {
        ILog.LogDebug("同事2收到信息："+message);
    }
}
