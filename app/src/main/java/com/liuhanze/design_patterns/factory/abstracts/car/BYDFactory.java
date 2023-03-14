package com.liuhanze.design_patterns.factory.abstracts.car;

public class BYDFactory implements IFactory{

    @Override
    public IEngine madeEngine() {
        return new BYDEngine();
    }

    @Override
    public ISpeedBox madSpeedBox() {
        return new BYDSpeedBox();
    }
}
