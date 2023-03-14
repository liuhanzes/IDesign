package com.liuhanze.design_patterns.command.demo1;

/**
 * ConcreteCommand类，将一个接收者对象绑定于一个动作，调用接收者相应的操作，以实现Execute。
 */
public class ConcreteCommand extends Command{


    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        mReceiver.action();
    }
}
