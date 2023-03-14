package com.liuhanze.design_patterns.memento.demo1;

/**
 * 备忘录类
 * 负责存储Originator对象的内部状态，并可防止Originator以外的其他对象访问备忘录Memento。
 * 备忘录有两个接口，Caretaker只能看到备忘录的窄接口，它只能将备忘录传递给其他对象。
 * Originator能够看到一个宽接口，允许它访问返回到先前状态所需的所有数据。
 *
 * 关闭public 修饰符 默认同包可访问
 * 除了原发器类，备忘录类不能被其他类创建和修改。一般通过将Memento类与Originator类定义在同
 * 一个包中来实现封装（也可以作为内部类），使用默认访问标识符来定义Memento类，即保证其包内可见。
 */
class Memento {

    private String state;

    public Memento(String state){
     this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
