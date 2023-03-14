package com.liuhanze.design_patterns.templatemethod;

public class CatSwim extends AnimalSwimming {

    @Override
    public void swimming() {
        System.out.printf("我是小猫，我可能会被淹死");
    }
}
