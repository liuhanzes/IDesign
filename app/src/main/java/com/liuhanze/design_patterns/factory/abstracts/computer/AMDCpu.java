package com.liuhanze.design_patterns.factory.abstracts.computer;

public class AMDCpu implements ICPU{

    private int pins = 0;

    public AMDCpu(int pin){
        pins = pin;
    }

    @Override
    public void calculate() {
        System.out.printf("amd cpu pin = "+pins);
    }
}
