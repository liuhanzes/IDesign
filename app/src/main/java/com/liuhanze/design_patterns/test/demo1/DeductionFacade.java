package com.liuhanze.design_patterns.test.demo1;

public class DeductionFacade {

    public static Card deduct(Card card,Trade trade){
        StrategyEnum strategyEnum = getDeductionType(trade);
        IDeduction deduction = StrategyFactory.getDeduction(strategyEnum);
        DeductionContext deductionContext = new DeductionContext(deduction);
        deductionContext.exec(card,trade);

        return card;
    }

    private static StrategyEnum getDeductionType(Trade trade) {

        if(trade.getTradeNo().contains("abc")){
            return StrategyEnum.SteadyDeduction;
        }else{
            return StrategyEnum.FreeDeduction;
        }
    }

}
