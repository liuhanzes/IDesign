package com.liuhanze.design_patterns.command.demo1;

/**
 * Command类，用来声明执行操作的接口。
 */
public abstract class Command {
    protected Receiver mReceiver;

    public Command(Receiver receiver){
        mReceiver = receiver;
    }

    public abstract void execute();

}
