package com.liuhanze.design_patterns.factory.abstracts.computer;

public class IntelFactory implements IFactory{

    @Override
    public ICPU createCPU() {
        return new IntelCpu(755);
    }

    @Override
    public IBoard createBoard() {
        return new IntelBoard(755);
    }

}
