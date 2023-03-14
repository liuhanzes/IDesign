package com.liuhanze.design_patterns.factory.abstracts.computer;

public class AmdFactory implements IFactory{

    @Override
    public ICPU createCPU() {
        return new AMDCpu(938);
    }

    @Override
    public IBoard createBoard() {
        return new AMDBoard(938);
    }
}
