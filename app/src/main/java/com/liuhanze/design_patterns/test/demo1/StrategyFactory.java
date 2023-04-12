package com.liuhanze.design_patterns.test.demo1;

class StrategyFactory {

    public static IDeduction getDeduction(StrategyEnum strategyEnum){
        IDeduction deduction = null;

        try {
            deduction = (IDeduction) Class.forName(strategyEnum.getValue()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return deduction;
    }
}
