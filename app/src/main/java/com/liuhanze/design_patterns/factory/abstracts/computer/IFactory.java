package com.liuhanze.design_patterns.factory.abstracts.computer;

public interface IFactory {
    ICPU createCPU();
    IBoard createBoard();
}
