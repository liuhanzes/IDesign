package com.liuhanze.design_patterns.bridge.demo3;

public abstract class Corp {

    private IProduct product;

    public Corp(IProduct product){
        this.product = product;
    }

    public void makeMoney(){
        product.beProducted();
        product.beSelled();
    }
}
