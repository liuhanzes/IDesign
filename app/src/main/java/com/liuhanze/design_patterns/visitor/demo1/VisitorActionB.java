package com.liuhanze.design_patterns.visitor.demo1;

import com.liuhanze.iutil.log.ILog;

/**
 * 具体访问者，实现每个由Visitor声明的操作。每个操作实现算法的一部分，而该算法片断乃是对应于结构中对象的类。
 */
class VisitorActionB implements Visitor{

    @Override
    public void visitorConcreteElementA(ConcreteElementA concreteElementA) {
        ILog.LogDebug("elementA do VisitorActionB action");
    }

    @Override
    public void visitorConcreteElementB(ConcreteElementB concreteElementB) {
        ILog.LogDebug("elementB do VisitorActionB action");

    }
}
