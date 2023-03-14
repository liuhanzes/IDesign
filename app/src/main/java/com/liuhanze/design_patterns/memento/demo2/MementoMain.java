package com.liuhanze.design_patterns.memento.demo2;

public class MementoMain {

    public void main(){

        GameRole gameRole = new GameRole();
        gameRole.initState();

        RoleCaretaker caretaker = new RoleCaretaker();
        caretaker.setMemento(gameRole.saveState());

        gameRole.fight();
        gameRole.recoveryState(caretaker.getMemento());

    }
}
