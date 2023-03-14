package com.liuhanze.design_patterns.command.demo4;

import java.util.ArrayList;
import java.util.List;

public class MenuCommand implements ICommand{

    private List<ICommand> col = new ArrayList<>();

    public void addCommand(ICommand command){
        col.add(command);
    }

    @Override
    public void execute() {
        CommandQueue.addMenu(this);
    }

    @Override
    public void setCookie(ICookie cookie) {

    }

    @Override
    public int getTableNum() {
        return 0;
    }

    public List<ICommand> getCommand(){
        return col;
    }

}
