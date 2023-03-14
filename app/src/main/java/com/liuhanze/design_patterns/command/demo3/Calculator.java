package com.liuhanze.design_patterns.command.demo3;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private ICommand addCommand = null;
    private ICommand substractCommand = null;

    private List<ICommand> undoCmds = new ArrayList<>();
    private List<ICommand> redoCmds = new ArrayList<>();


    public void setAddCommand(ICommand addCommand){
        this.addCommand = addCommand;
    }

    public void setSubstractCommand(ICommand substractCommand){
        this.substractCommand = substractCommand;
    }

    public void addPressed(){
        addCommand.execute();
        undoCmds.add(addCommand);
    }

    public void substractPressed(){
        substractCommand.execute();
        undoCmds.add(substractCommand);
    }

    public void undoPressed(){
        if(undoCmds.size() > 0){
            ICommand command = undoCmds.get(undoCmds.size() -1);
            command.undo();
            redoCmds.add(command);
            undoCmds.remove(command);
        }
    }

    public void redoPressed(){
        if(redoCmds.size() > 0){
            ICommand command = redoCmds.get(redoCmds.size() -1);
            command.execute();
            undoCmds.add(command);
            redoCmds.remove(command);
        }
    }

}
