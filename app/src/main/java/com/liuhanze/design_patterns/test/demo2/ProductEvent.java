package com.liuhanze.design_patterns.test.demo2;

import java.util.Observable;

public class ProductEvent extends Observable {

    private Product source;
    private ProductEventType eventType;

    public ProductEvent(Product product){
        this(product,ProductEventType.NEW_PRODUCT);
    }

    public ProductEvent(Product product,ProductEventType eventType){
        this.source = product;
        this.eventType = eventType;
        notifyEventDispatch();
    }


    public Product getSource(){
        return source;
    }

    public ProductEventType getEventType(){
        return eventType;
    }


    private void notifyEventDispatch() {

        addObserver(EventDispatch.getDispatch());
        setChanged();
        notifyObservers(source);

    }


}
