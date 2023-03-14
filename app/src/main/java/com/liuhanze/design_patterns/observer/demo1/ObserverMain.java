package com.liuhanze.design_patterns.observer.demo1;

/**
 * 观察者模式
 * 定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象，这个主题对象在状态发生变化时，会通知
 * 所有的观察者对象，使它们能够自动更新自己。
 */
public class ObserverMain {

    public void main(){
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserver(subject,"胡汉三"));
        subject.attach(new ConcreteObserver(subject,"三三"));

        subject.setNotifyContext("哈哈哈 我回来了");
        subject.myNotify();


    }
}
