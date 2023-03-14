package com.liuhanze.design_patterns.visitor.demo1;

/**
 * Visitor类，为该对象结构中ConcreteElement的每一个类声明一个Visit操作。
 */
interface Visitor {
    void visitorConcreteElementA(ConcreteElementA concreteElementA);
    void visitorConcreteElementB(ConcreteElementB concreteElementB);
}
