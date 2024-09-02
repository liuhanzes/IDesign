package com.liuhanze.design_patterns.test.demo2;

import android.media.metrics.Event;

import java.util.Observable;
import java.util.Observer;

public class EventObserver implements Observer {

    private final static EventObserver  observer = new EventObserver();

    private EventObserver(){

    }

    public static EventObserver getObserver(){
        return observer;
    }

    @Override
    public void update(Observable o, Object arg) {

    }



}
