package com.liuhanze.design_patterns.command.demo4;

import java.util.ArrayList;
import java.util.List;

public class CommandQueue {

    private static List<ICommand> cmds = new ArrayList<>();


    public synchronized static void addMenu(MenuCommand menuCommand){
        cmds.add(menuCommand);
    }

    public synchronized static ICommand getOneCommand(){
        ICommand command = null;
        if(cmds.size() > 0){
            command = cmds.get(0);
            cmds.remove(0);
        }
        return  command;
    }



}
