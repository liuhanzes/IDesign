package com.liuhanze.design_patterns.responsibility.demo1;

abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler handler){
        nextHandler = handler;
    }

    public abstract void handlerRequest(int request);
}
