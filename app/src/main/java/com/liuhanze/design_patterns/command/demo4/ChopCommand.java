package com.liuhanze.design_patterns.command.demo4;

public class ChopCommand implements ICommand{

    private ICookie cookie;
    private int tableNum;

    public ChopCommand(int tableNum){
        this.tableNum = tableNum;
    }

    public void setCookie(ICookie cookie){
        this.cookie = cookie;
    }

    @Override
    public int getTableNum() {
        return tableNum;
    }

    @Override
    public void execute() {
        cookie.cookie(tableNum,"黄豆排骨");
    }
}
