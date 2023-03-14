package com.liuhanze.design_patterns.factory.abstracts.computer;

public class IntelCpu implements ICPU{

    private int pins = 0;

    public IntelCpu(int pin){
        pins = pin;
    }

    @Override
    public void calculate() {
        System.out.printf("intel cpu pin = "+pins);
    }
}
