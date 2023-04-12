package com.liuhanze.design_patterns.test.demo1;

class SteadyDeduction implements IDeduction{
    @Override
    public boolean exec(Card card, Trade trade) {
        int halfMoney = (int)Math.rint(trade.getAmount()/2.0);
        card.setSteadyMoney(card.getSteadyMoney() - halfMoney);
        card.setFreeMoney(card.getFreeMoney() - halfMoney);

        return true;
    }
}
