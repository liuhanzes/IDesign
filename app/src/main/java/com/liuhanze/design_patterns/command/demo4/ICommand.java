package com.liuhanze.design_patterns.command.demo4;

public interface ICommand {

    void execute();
    void setCookie(ICookie cookie);
    int getTableNum();
}
