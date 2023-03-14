package com.liuhanze.design_patterns.factory.abstracts.car;

public class BenCiSpeedBox implements ISpeedBox{

    @Override
    public void changeSpeed() {
        System.out.printf("this is benci change speed ++");
    }
}
