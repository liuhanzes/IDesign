package com.liuhanze.design_patterns.visitor.demo2;

public class Woman implements Person{

    @Override
    public void accept(Action visitor) {
        visitor.getWomanManConclusion(this);
    }
}
