package com.liuhanze.design_patterns.command.demo3;

public class CommandMain {


    public void main(){

        IOperation operation = new Operation();
        AddCommand addCommand = new AddCommand(operation,5);
        SubstractCommand substractCommand = new SubstractCommand(operation,3);

        Calculator calculator = new Calculator();
        calculator.setAddCommand(addCommand);
        calculator.setSubstractCommand(substractCommand);

        calculator.addPressed();
        calculator.substractPressed();

        calculator.undoPressed();
        calculator.undoPressed();

        calculator.redoPressed();
        calculator.redoPressed();

    }
}
