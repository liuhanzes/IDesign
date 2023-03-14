package com.liuhanze.design_patterns.visitor.demo2;

public class Man implements Person {

    @Override
    public void accept(Action visitor) {
        visitor.getManConclusion(this);
    }
}
