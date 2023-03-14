package com.liuhanze.design_patterns.templatemethod;

public class DogSwim extends AnimalSwimming {

    @Override
    public void swimming() {
        System.out.printf("我是小狗,我游狗刨式");
    }
}
