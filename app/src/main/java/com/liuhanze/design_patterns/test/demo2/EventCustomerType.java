package com.liuhanze.design_patterns.test.demo2;

public enum EventCustomerType {

    NEW(1),
    DEL(2),
    EDIT(3),
    CLONE(4);

    private int value;
    EventCustomerType(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}
