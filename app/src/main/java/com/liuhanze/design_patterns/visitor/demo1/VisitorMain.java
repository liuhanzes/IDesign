package com.liuhanze.design_patterns.visitor.demo1;

/**
 * 访问者模式
 * 表示一个作用于某对象结构中的各元素的操作，它使你可以在不改变各元素的类前提下定义作用于这些元素的新操作。
 *
 * 访问者模式适用于数据结构相对稳定的系统
 * 它把数据结构和作用于结构上的操作之间的耦合解脱开，使得操作集合可以相对自由地演化。
 *
 * 访问者模式的目的是要把处理从数据结构分离出来。很多系统可以按照算法和数据结构分开，如果这样的系统有比较稳定的数据结构，
 * 又有易于变化的算法的话，使用访问者模式就是比较合适的，因为访问者模式使得算法操作的增加变得容易。反之，如果这样的系统
 * 的数据结构对象易于变化，经常要有新的数据对象增加进来，就不适合使用访问者模式。
 *
 * 访问者模式的优点就是增加新的操作很容易，因为增加新的操作就意味着增加一个新的访问者。访问者模式将有关的行为集中
 * 到一个访问者对象中。访问者模式中 新操作就是访问者，访问者的缺点其实也就是使增加新的数据结构变得困难了。
 *
 * 所以GoF四人中的一个作者就说过：‘大多时候你并不需要访问者模式，但当一旦你需要访问者模式时，那就是真的需要它了。
 * ’事实上，我们很难找到数据结构不变化的情况，所以用访问者模式的机会也就不太多了。这也就是为什么你谈到男人女人对比时我很
 * 高兴和你讨论的原因，因为人类性别这样的数据结构是不会变化的。
 *
 * 使用场景：
 * 需要对一个对象结构中的对象进行很多不同并且不相关的操作，而你想避免让这些操作“污染”这些对象的类。
 * 业务规则要求遍历多个不同的对象。这本身也是访问者模式出发点，迭代器模式只能访问同类或同接口的数据（当然了，如果你使用
 * instanceof，那么能访问所有的数据，这没有争论），而访问者模式是对迭代器模式的扩充，可以遍历不同的对象，然后执行不同的操作，
 * 也就是针对访问的对象不同，执行不同的操作。访问者模式还有一个用途，就是充当拦截器（Interceptor）角色
 *
 */
public class VisitorMain {


    public void main(){
        ObjectStructure objectStructure = new ObjectStructure();

        ConcreteElementA concreteElementA = new ConcreteElementA();
        ConcreteElementB concreteElementB = new ConcreteElementB();

        objectStructure.attach(concreteElementA);
        objectStructure.attach(concreteElementB);

        Visitor visitorA = new VisitorActionA();
        Visitor visitorB = new VisitorActionB();

        objectStructure.accept(visitorA);
        objectStructure.accept(visitorB);
    }
}
