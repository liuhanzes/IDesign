package com.liuhanze.design_patterns.factory.abstracts.car;

public interface IFactory {

    IEngine madeEngine();
    ISpeedBox madSpeedBox();
    //IWheel makeWheel();
}
