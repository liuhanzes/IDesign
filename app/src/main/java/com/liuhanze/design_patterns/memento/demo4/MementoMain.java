package com.liuhanze.design_patterns.memento.demo4;

/**
 * 备忘录 窄接口 内部类实现
 * 管理者 Caretaker 调用在originator中实现
 */
public class MementoMain {

    public void main(){

        Originator originator = new Originator();
        originator.setState("状态1");
        originator.createMemento();
        originator.recoveryMemento();


    }
}
