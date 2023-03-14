package com.liuhanze.design_patterns.mediator.demo1;

/**
 * 具体中介者角色通过协调各同事角色实现协作行为，因此它必须依赖于各个同事角色。
 * 在Mediator抽象类中我们只定义了同事类的注入，为什么使用同事实现类注入而不使用抽象类注入呢？
 * 那是因为同事类虽然有抽象，但是没有每个同事类必须要完成的业务方法，当然如果每个同事类都有相同的方法，
 * 比如execute、handler等，那当然注入抽象类，做到依赖倒置
 */
public class ConcreteMediator implements Mediator{

    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void sendMessage(String message, Colleague colleague) {

        if(colleague instanceof ConcreteColleague1){
            colleague2.notify(message);
        }else if(colleague instanceof ConcreteColleague2){
            colleague1.notify(message);
        }
    }
}
