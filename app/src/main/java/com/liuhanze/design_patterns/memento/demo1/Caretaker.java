package com.liuhanze.design_patterns.memento.demo1;

/**
 * 备忘录管理者
 * 负责保存好备忘录Memento，不能对备忘录的内容进行操作或检查。
 * 负责人又称为管理者，它负责保存备忘录。在负责人类中可以存储一个或多个备忘录对象，它只负责存储对象，
 * 而不能修改对象（负责人类只提供备忘录对象的读接口，不提供备忘录属性的写接口），也无须知道对象的
 * 实现细节。负责人对象可以保存一个备忘录数组，从而实现原发器的多次撤销。
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
