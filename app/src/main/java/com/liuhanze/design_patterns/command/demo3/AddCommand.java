package com.liuhanze.design_patterns.command.demo3;

public class AddCommand  implements ICommand{

    private IOperation operation;
    private int num;

    public AddCommand(IOperation operation,int num){
        this.operation = operation;
        this.num = num;
    }

    @Override
    public void execute() {
        operation.add(num);
    }

    @Override
    public void undo() {
        operation.substract(num);
    }
}
