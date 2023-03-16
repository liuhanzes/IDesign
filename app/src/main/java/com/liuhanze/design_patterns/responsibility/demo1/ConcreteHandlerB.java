package com.liuhanze.design_patterns.responsibility.demo1;

import com.liuhanze.iutil.log.ILog;

class ConcreteHandlerB extends Handler{
    @Override
    public void handlerRequest(int request) {
        if(request >= 10 && request < 20){
            ILog.LogDebug(this.getClass().getSimpleName()+"处理请求 request : "+request);
        }else if(nextHandler != null){
            nextHandler.handlerRequest(request);
        }
    }
}
