package com.liuhanze.design_patterns.command.demo2;

public class Invoker {

    private ICommand mCommand;

    public void setCommand(ICommand command){
        mCommand = command;
    }

    public void execute(){
        mCommand.execute();
    }

}
