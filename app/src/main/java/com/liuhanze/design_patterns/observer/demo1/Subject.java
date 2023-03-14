package com.liuhanze.design_patterns.observer.demo1;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observerList = new ArrayList<>();

    public void attach(Observer observer){
        observerList.add(observer);
    }

    public void detach(Observer observer){
        observerList.remove(observer);
    }

    public void myNotify(){

        for (Observer ob:observerList) {
                ob.update();
        }

    }
}
