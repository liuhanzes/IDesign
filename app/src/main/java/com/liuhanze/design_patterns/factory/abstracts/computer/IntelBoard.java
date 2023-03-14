package com.liuhanze.design_patterns.factory.abstracts.computer;

public class IntelBoard implements IBoard{

    private int pinHoles = 0;

    public IntelBoard(int hole){
        pinHoles = hole;
    }

    @Override
    public void installCpu() {
            System.out.printf("intel board support pinholes ="+pinHoles);
    }
}
