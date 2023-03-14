package com.liuhanze.design_patterns.factory.abstracts.car;

public class BYDSpeedBox implements ISpeedBox {

    @Override
    public void changeSpeed() {
        System.out.printf("this is byd change speed ++");
    }
}
