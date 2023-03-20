package com.liuhanze.design_patterns.flyweight.demo1;

/**
 * 享元模式
 * 运用共享技术有效的支持大量细粒度的对象
 * <br/><br/>
 * <img width="500" height="wrap_content" src="../../../../../../res/mipmap-xhdpi/flyweight.png"/>
 * <br/><br/>
 *
 * 在享元对象内部并且不会随环境改变而改变的共享部分，可以称为是享元对象的内部状态，而随环境改变而改变的、不可以共享的状态就
 * 是外部状态了。事实上，享元模式可以避免大量非常相似类的开销。在程序设计中，有时需要生成大量细粒度的类实例来表示数据。如果
 * 能发现这些实例除了几个参数外基本上都是相同的，有时就能够受大幅度地减少需要实例化的类的数量。如果能把那些参数移到类实例的
 * 外面，在方法调用时将它们传递进来，就可以通过共享大幅度地减少单个实例的数目。也就是说，享元模式Flyweight执行时所需的状
 * 态是有内部的也可能有外部的，内部状态存储于ConcreteFlyweight对象之中，而外部对象则应该考虑由客户端对象存储或计算，当
 * 调用Flyweight对象的操作时，将该状态传递给它。
 *
 * 使用场景
 * 如果一个应用程序使用了大量的对象，而大量的这些对象造成了很大的存储开销时就应该考虑使用；还有就是对象的大多数状态可以外部状态，
 * 如果删除对象的外部状态，那么可以用相对较少的共享对象取代很多组对象，此时可以考虑使用享元模式。
 *
 * 效果：
 * 因为用了享元模式，所以有了共享对象，实例总数就大大减少了，如果共享的对象越多，存储节约也就越多，节约量随着共享状态的增多而增大。
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

        Flyweight unShare =  new UnShareFlyweight();
        unShare.operation(extendState);

    }

}
