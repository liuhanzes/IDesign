package com.liuhanze.design_patterns.factory.abstracts.car;

public class BYDEngine implements IEngine {

    @Override
    public void run() {
        System.out.printf("this is byd run");
    }
}
