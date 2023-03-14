package com.liuhanze.design_patterns.factory.abstracts.car;

public class BMWEngine implements IEngine {
    @Override
    public void run() {
        System.out.printf("this is bmw run");
    }

}
