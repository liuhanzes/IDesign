package com.liuhanze.design_patterns.factory.abstracts.computer;

public class AMDBoard implements IBoard{

    private int pinholes = 0;

    public AMDBoard(int holes){
        pinholes = holes;
    }

    @Override
    public void installCpu() {
        System.out.printf("amd board support pin holes = "+pinholes);
    }
}
