package com.liuhanze.design_patterns.mediator.demo1;

/**
 * 每一个同事角色都知道中介者角色，而且与其他的同事角色通信的时候，一定要通过中介者角色协作。
 * 每个同事类的行为分为两种：一种是同事本身的行为，比如改变对象本身的状态，处理自己的行为等，这种行为叫做
 * 自发行为（Self-Method），与其他的同事类或中介者没有任何的依赖；第二种是必须依赖中介者才能完成的行为，
 * 叫做依赖方法（Dep-Method）。
 *
 * 可以在如下的情况下尝试使用中介者模式：
 * ● N个对象之间产生了相互的依赖关系（N＞2）。
 * ● 多个对象有依赖关系，但是依赖的行为尚不确定或者有发生改变的可能，在这种情况下一般建议采用中介者模式，降低
 * 变更引起的风险扩散。
 * ● 产品开发。一个明显的例子就是MVC框架，把中介者模式应用到产品中，可以提升产品的性能和扩展性，但是对于项目开
 * 发就未必，因为项目是以交付投产为目标，而产品则是以稳定、高效、扩展为宗旨。
 */
abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    abstract void sendMessage(String message);
    abstract void notify(String message);
}
