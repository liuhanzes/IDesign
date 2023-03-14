package com.liuhanze.design_patterns.memento.demo3;

/**
 * 备忘录 窄接口 内部类实现
 */
public class MementoMain {

    public void main(){

        Originator originator = new Originator();
        originator.setState("状态1");

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        /**
         * originator do something
         */

        originator.recoveryMemento(caretaker.getMemento());


    }
}
