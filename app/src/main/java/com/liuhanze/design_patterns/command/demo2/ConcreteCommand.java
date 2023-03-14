package com.liuhanze.design_patterns.command.demo2;

public class ConcreteCommand implements ICommand{
    private Receiver mReceiver;

    public ConcreteCommand(Receiver receiver){
        mReceiver = receiver;
    }

    @Override
    public void execute() {
        mReceiver.action();
    }
}
