package com.liuhanze.design_patterns.bridge.demo1;

/**
 * 抽象化角色
 * 它的主要职责是定义出该角色的行为，同时保存一个对实现化角色的引用，该角色一般是抽象类
 */
class Abstraction {
    //定义对实现化角色的引用
    protected Implementor implementor;

    //约束子类必须是实现该构造函数
    public Abstraction(Implementor implementor){
        this.implementor = implementor;

    }

    public void setImplementor(Implementor implementor){
        this.implementor = implementor;
    }

    //自身的行为和属性
    public void operation(){
        implementor.operation();
    }
}
