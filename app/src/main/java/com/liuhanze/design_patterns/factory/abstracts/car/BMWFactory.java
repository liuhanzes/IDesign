package com.liuhanze.design_patterns.factory.abstracts.car;

public class BMWFactory implements IFactory{

    @Override
    public IEngine madeEngine() {
        return new BMWEngine();
    }

    @Override
    public ISpeedBox madSpeedBox() {
        return new BMWSpeedBox();
    }
}
