package com.liuhanze.design_patterns.bridge.demo1;

/**
 * 桥接模式/桥梁模式/柄体模式
 * 桥接模式的重点在于解耦，减少继承多用聚合/组合
 * 将抽象部分与它的实现部分分离，使他们都可以独立变化
 * 什么叫抽象与它的实现分离，这并不是说，让抽象类与其派生类分离，因为这没有任何意义。
 * 实现系统可能有多角度分类，每一种分类都有可能变化，那么就把这种多角度分离出来让它们独立变化，减少它们之间的耦合。
 * 实现指的是抽象类和它的派生类用来实现自己的对象，就刚才的例子而言，就是让‘手机’既可以按照品牌来分类，也可以按照功能来分类。
 * 由于实现的方式有多种，桥接模式的核心意图就是把这些实现独立出来，让它们各自地变化。这就使得每种实现的变化不会影响其他实现，从而达到应对变化的目的。
 *
 * 桥梁模式的意图还是对变化的封装，尽量把可能变化的因素封装到最细、最小的逻辑单元中，避免风险扩散。
 *
 * 按品牌分类
 * <img width="500" height="wrap_content" src="../../../../../../res/mipmap-xhdpi/brand_type.png"/>
 * 按软件分类
 * <img width="500" height="wrap_content" src="../../../../../../res/mipmap-xhdpi/soft_type.png"/>
 * 桥接模式
 * <img width="500" height="wrap_content" src="../../../../../../res/mipmap-xhdpi/bridge.png"/>
 */
public class BridgeMain {

    public void main(){

        Implementor implementorA = new ConcreteImplementorA();
        Implementor implementorB = new ConcreteImplementorB();

        Abstraction abstraction = new RefinedAbstraction(implementorA);

        abstraction.setImplementor(implementorA);
        abstraction.operation();

        abstraction.setImplementor(implementorB);
        abstraction.operation();
    }
}
