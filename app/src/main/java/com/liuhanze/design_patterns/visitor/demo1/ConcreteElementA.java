package com.liuhanze.design_patterns.visitor.demo1;

/**
 * 固定的数据结构A
 */
class ConcreteElementA implements Element{

    @Override
    public void accept(Visitor visitor) {
        visitor.visitorConcreteElementA(this);
    }

    public void methodOtherA(){

    }
}
