package com.liuhanze.design_patterns.decorator.demo1;

import com.liuhanze.iutil.log.ILog;

/**
 * 装饰模式
 * 动态地给一个对象添加一些额外得职责，就增加功能来说，装饰模式比生成子类更加灵活。
 * 装饰模式是为已有功能动态地添加更多功能的一种方式
 *
 * 使用场景：
 * 你起初的设计中，当系统需要新功能的时候，是向旧的类中添加新的代码。这些新加的代码通常装饰了原有类的核心职责或主要行为，
 * 比如用西装或嘻哈服来装饰小菜，但这种做法的问题在于，它们在主类中加入了新的字段，新的方法和新的逻辑，从而增加了主类的复杂度，
 * 就像你起初的那个‘人’类，而这些新加入的东西仅仅是为了满足一些只在某种特定情况下才会执行的特殊行为的需要。而装饰模式却提供了
 * 一个非常好的解决方案，它把每个要装饰的功能放在单独的类中，并让这个类包装它所要装饰的对象，因此，当需要执行特殊行为时，
 * 客户代码就可以在运行时根据需要有选择地、按顺序地使用装饰功能包装对象了
 * 在不想增加很多子类的情况下扩展类时
 *
 * 优点：
 * 把类中的装饰功能从类中搬移去除，这样可以简化原有的类。有效地把类的核心职责和装饰功能区分开了。而且可以去除相关类中重复的装饰逻辑。
 * 装饰模式的装饰顺序很重要哦，比如加密数据和过滤词汇都可以是数据持久化前的装饰功能，但若先加密了数据再用过滤功能就会出问题了，最理想的情况，
 * 是保证装饰类之间彼此独立，这样它们就可以以任意的顺序进行组合了。
 * 装饰类和被装饰类可以独立发展，而不会相互耦合。它有效地把类的核心职责和装饰功能分开了
 * 装饰模式是继承关系的一个替代方案
 * 装饰模式可以动态地扩展一个实现类的功能
 *
 * 缺点
 * 多层装饰比较复杂。比如我们现在有很多层装饰，出了问题，一层一层检查，最后发现是最里层的装饰出问题了，想想工作量都害怕
 *
 *
 */
public class DecoratorMain {

    public void main(){
        ILog.setStackTraceLevel(3);
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();

        concreteDecoratorA.setComponent(concreteComponent);  //第一层功能
        concreteDecoratorB.setComponent(concreteDecoratorA); //第二层功能
        concreteDecoratorB.operation();

    }
}
