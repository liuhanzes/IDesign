package com.liuhanze.design_patterns.strategy.demo1;

public class StrategyContext {

    IStrategy mStrategy;

    public StrategyContext(IStrategy strategy){
        mStrategy = strategy;
    }

    public void execAlgorithm(){
        mStrategy.algorithmInterface();
    }
}
