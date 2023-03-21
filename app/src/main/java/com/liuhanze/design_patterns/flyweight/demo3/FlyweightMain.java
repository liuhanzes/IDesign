package com.liuhanze.design_patterns.flyweight.demo3;

/**
 * 享元模式
 *
 * 内部状态是对象可共享出来的信息，存储在享元对象内部并且不会随环境改变而改变，如我们例子中的id、postAddress等，
 * 它们可以作为一个对象的动态附加信息，不必直接储存在具体某个对象中，属于可以共享的部分。
 *
 * 外部状态是对象得以依赖的一个标记，是随环境改变而改变的、不可以共享的状态，如我们例子中的考试科目+考试地点复合字符串，
 * 它是一批对象的统一标识，是唯一的一个索引值。
 *
 * 享元模式是一个非常简单的模式，它可以大大减少应用程序创建的对象，降低程序内存的占用，增强程序的性能，
 * 但它同时也提高了系统复杂性，需要分离出外部状态和内部状态，而且外部状态具有固化特性，不应该随内部状
 * 态改变而改变，否则导致系统的逻辑混乱。
 *
 * 在如下场景中则可以选择使用享元模式。
 * ● 系统中存在大量的相似对象。
 * ● 细粒度的对象都具备较接近的外部状态，而且内部状态与环境无关，也就是说对象没有特定身份。
 * ● 需要缓冲池的场景。
 */
public class FlyweightMain {

    public void main(){
        String extendState = "22";
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight fx = factory.getFlyweight("X");
        fx.operation(extendState);

        Flyweight fy = factory.getFlyweight("Y");
        fy.operation(extendState);

        Flyweight fz = factory.getFlyweight("Z");
        fz.operation(extendState);

        Flyweight unShare =  new UnShareFlyweight("U");
        unShare.operation(extendState);

    }

}
