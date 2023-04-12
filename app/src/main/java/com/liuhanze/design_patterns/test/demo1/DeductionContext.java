package com.liuhanze.design_patterns.test.demo1;

class DeductionContext {

    private IDeduction deduction;

    public DeductionContext(IDeduction iDeduction){
        deduction = iDeduction;
    }

    public boolean exec(Card card,Trade trade){
        deduction.exec(card,trade);
        return true;
    }

}
