package com.liuhanze.design_patterns.test.demo2;

import java.util.List;
import java.util.Vector;

public abstract class EventCustomer {
    private Vector<EventCustomerType> customerTypeVector = new Vector<>();

    public EventCustomer(EventCustomerType type){
        addCustomerType(type);
    }

    public void addCustomerType(EventCustomerType type){
        customerTypeVector.add(type);
    }

    public Vector<EventCustomerType> getCustomerTypeVector(){
        return customerTypeVector;
    }

    public abstract void exec(ProductEvent event);





}
