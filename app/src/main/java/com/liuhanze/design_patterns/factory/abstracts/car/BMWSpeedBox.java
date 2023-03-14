package com.liuhanze.design_patterns.factory.abstracts.car;

public class BMWSpeedBox implements ISpeedBox {

    @Override
    public void changeSpeed() {
        System.out.printf("this is bmw change speed ++");
    }
}
