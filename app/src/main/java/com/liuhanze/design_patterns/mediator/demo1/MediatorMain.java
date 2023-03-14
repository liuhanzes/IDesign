package com.liuhanze.design_patterns.mediator.demo1;

/**
 * 中介者模式/调停者模式
 * 用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显示的相互引用，从而使其耦合松散，而且可以
 * 独立的改变他们之间的交互。
 * 中介者模式很容易在系统中应用，也很容易在系统中误用。当系统出现了‘多对多’交互复杂的对象群时，不要急于
 * 使用中介者模式，而要先反思你的系统在设计上是不是合理。
 *
 * 中介者模式的优点首先是Mediator的出现减少了各个Colleague的耦合，使得可以独立地改变和复用各个Colleague类和Mediator，
 * 其次，由于把对象如何协作进行了抽象，将中介作为一个独立的概念并将其封装在一个对象中，这样关注的对象就从对象各自本身的行为
 * 转移到它们之间的交互上来，也就是站在一个更宏观的角度去看待系统。
 *
 * 由于ConcreteMediator控制了集中化，于是就把交互复杂性变为了中介者的复杂性，这就使得中介者会变得比任何一个
 * ConcreteColleague都复杂。
 *
 * 中介者模式一般应用于一组对象以定义良好但是复杂的方式进行通信的场合，以及想定制一个分布在多个类中的行为，
 * 而又不想生成太多的子类的场合
 *
 * 类之间的依赖关系是必然存在的，一个类依赖多个类的情况也是存在的，存在即合理，那是否可以说只要有多个依赖关系就考虑
 * 使用中介者模式呢？答案是否定的。中介者模式未必能帮你把原本凌乱的逻辑整理得清清楚楚，而且中介者模式也是有缺点的，
 * 这个缺点在使用不当时会被放大，比如原本就简单的几个对象依赖关系，如果为了使用模式而加入了中介者，必然导致中介者的
 * 逻辑复杂化，因此中介者模式的使用需要“量力而行”！中介者模式适用于多个对象之间紧密耦合的情况，紧密耦合的标准是：
 * 在类图中出现了蜘蛛网状结构。在这种情况下一定要考虑使用中介者模式，这有利于把蜘蛛网梳理为星型结构，使原本复杂混乱
 * 的关系变得清晰简单。
 */
public class MediatorMain {

    public void main(){

        //为什么同事类要使用构造函数注入中介者，而中介者使用getter/setter方式注入同事类呢？这是因为同事类必须有中介者，
        // 而中介者却可以只有部分同事类。
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);
        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);
        colleague1.sendMessage("你好啊");
        colleague2.sendMessage("你也好啊");
    }
}
