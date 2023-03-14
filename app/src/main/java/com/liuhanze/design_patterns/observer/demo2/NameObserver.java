package com.liuhanze.design_patterns.observer.demo2;

import java.util.Observable;
import java.util.Observer;

public class NameObserver implements Observer {

    private String name = null;

    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof String){
            name = (String) arg;
            System.out.printf("NameObserver : name change to "+name);
        }
    }
}
