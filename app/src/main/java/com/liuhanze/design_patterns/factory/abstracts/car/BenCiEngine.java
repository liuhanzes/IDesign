package com.liuhanze.design_patterns.factory.abstracts.car;

public class BenCiEngine implements IEngine{
    @Override
    public void run() {
        System.out.printf("this is benci engine");
    }
}
