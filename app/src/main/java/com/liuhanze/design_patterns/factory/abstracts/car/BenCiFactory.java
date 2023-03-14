package com.liuhanze.design_patterns.factory.abstracts.car;

public class BenCiFactory implements IFactory{

    @Override
    public IEngine madeEngine() {
        return new BenCiEngine();
    }

    @Override
    public ISpeedBox madSpeedBox() {
        return new BenCiSpeedBox();
    }
}
