package com.liuhanze.design_patterns.command.demo4;

public class DuckCommand implements ICommand{

    private ICookie hotCook;
    private int tableNum;

    public DuckCommand(int tableNum){
        this.tableNum = tableNum;
    }

    @Override
    public void execute() {
        hotCook.cookie(tableNum,"烧鸭");
    }

    @Override
    public void setCookie(ICookie cookie) {
        this.hotCook = cookie;
    }

    @Override
    public int getTableNum() {
        return tableNum;
    }
}
