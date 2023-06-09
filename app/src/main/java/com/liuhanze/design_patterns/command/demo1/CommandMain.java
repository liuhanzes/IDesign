package com.liuhanze.design_patterns.command.demo1;

/**
 * 命令模式
 * 将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化，对请求排队或记录请求日志，
 * 以及支持可撤销的操作。
 */
public class CommandMain {

    public void main(){
        Receiver receiver = new Receiver();
        ConcreteCommand command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();

    }

}
