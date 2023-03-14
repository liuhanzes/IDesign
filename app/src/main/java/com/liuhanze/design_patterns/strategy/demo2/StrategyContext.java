package com.liuhanze.design_patterns.strategy.demo2;

public class StrategyContext {

    IStrategy mStrategy;

    public StrategyContext(int type){
      switch (type){
          case 1:
              mStrategy = new ConcreteStrategyA();
              break;
          case 2:
              mStrategy = new ConcreteStrategyB();
              break;
          case 3:
              mStrategy = new ConcreteStrategyC();
              break;
      }

    }

    public void execAlgorithm(){
        mStrategy.algorithmInterface();
    }
}
