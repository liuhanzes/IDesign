package com.liuhanze.design_patterns.visitor.demo1;

class ConcreteElementB implements Element{

    @Override
    public void accept(Visitor visitor) {
        visitor.visitorConcreteElementB(this);
    }

    public void methodOtherB(){

    }
}
