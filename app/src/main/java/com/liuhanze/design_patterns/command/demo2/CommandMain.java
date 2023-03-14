package com.liuhanze.design_patterns.command.demo2;

public class CommandMain {


    public void main(){
        Receiver receiver = new Receiver();
        ICommand command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.execute();

    }
}
