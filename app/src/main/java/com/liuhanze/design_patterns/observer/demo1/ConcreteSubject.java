package com.liuhanze.design_patterns.observer.demo1;

public class ConcreteSubject extends Subject{
    private String notifyContext;

    public String getNotifyContext() {
        return notifyContext;
    }

    public void setNotifyContext(String notifyContext) {
        this.notifyContext = notifyContext;
    }

}
