package com.liuhanze.design_patterns.proxy.demo2;

public class Proxy implements IGiveGift{

    Pursuit pursuit ;

    public Proxy(SchoolGirl schoolGirl){
        pursuit = new Pursuit(schoolGirl);
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    @Override
    public void giveDolls() {
        pursuit.giveDolls();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}
