package com.liuhanze.design_patterns.command.demo1;

/**
 * Invoker类，要求该命令执行这个请求。
 */
public class Invoker {

    private Command mCommand;

    public void setCommand(Command command){
        mCommand = command;
    }

    public void executeCommand(){
        mCommand.execute();
    }

}
