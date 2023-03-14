package com.liuhanze.design_patterns.observer.demo2;

import java.util.Observable;
import java.util.Observer;

public class PriceObserver implements Observer {
    private float price = 0;

    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof Float){
            price = ((Float) arg).floatValue();
            System.out.printf("PriceObserver : price change to "+price);
        }
    }
}
