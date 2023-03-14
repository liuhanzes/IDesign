package com.liuhanze.design_patterns.observer.demo1;

public class ConcreteObserver implements Observer{
    private ConcreteSubject mSubject;
    private String mName;

    public ConcreteObserver(ConcreteSubject subject,String name){
        mSubject = subject;
        mName = name;
    }

    public void setSubject(ConcreteSubject subject){
        mSubject = subject;
    }

    @Override
    public void update() {
        System.out.printf("ConcreteObserver : "+mName+",  update : "+mSubject.getNotifyContext());
    }
}
