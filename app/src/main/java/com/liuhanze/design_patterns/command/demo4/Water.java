package com.liuhanze.design_patterns.command.demo4;

public class Water {

    private MenuCommand menuCommand = new MenuCommand();


    public void orderDish(ICommand command){

        menuCommand.addCommand(command);
    }

    public void orderOver(){
        menuCommand.execute();
    }



}
