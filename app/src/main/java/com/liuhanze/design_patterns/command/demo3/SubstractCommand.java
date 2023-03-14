package com.liuhanze.design_patterns.command.demo3;

public class SubstractCommand implements ICommand{

    private IOperation operation;
    private int num;

    public SubstractCommand(IOperation operation , int num){
        this.operation = operation;
        this.num = num;
    }

    @Override
    public void execute() {
        operation.substract(num);
    }

    @Override
    public void undo() {
        operation.add(num);
    }
}
