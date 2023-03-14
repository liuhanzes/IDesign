package com.liuhanze.design_patterns.memento.demo1;

import com.liuhanze.iutil.log.ILog;

/**
 * 备忘录发起者
 * 负责创建一个备忘录Memento，用以记录当前时刻它的内部状态，并可使用备忘录恢复内部状态。
 * Originator可根据需要决定Memento存储Originator的哪些内部状态。
 *
 * 它是一个需要保存状态的类，可以创建一个备忘录/备份，并存储它的当前内部状态，也可以使用备忘录来恢复其内部状态。
 * 备注：只存储一个备忘录对象时为什么需要负责人对象？因为包外的客户端无法声明备忘录类的引用，无法
 * 获取引用到原发器类创建的备忘录对象，客户端通过引用负责人对象间接引用备忘录对象。
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public void setMemento(Memento memento){
        state = memento.getState();
    }

    public void show(){
        ILog.LogDebug("state = "+state);
    }

}
