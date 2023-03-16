package com.liuhanze.design_patterns.visitor.demo3;

public class ElementB implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }
}
