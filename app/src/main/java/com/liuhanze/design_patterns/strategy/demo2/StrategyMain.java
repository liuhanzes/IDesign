package com.liuhanze.design_patterns.strategy.demo2;

public class StrategyMain {

    public void main(){
        StrategyContext context = new StrategyContext(1);
        context.execAlgorithm();
    }
}
