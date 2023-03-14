package com.liuhanze.design_patterns.memento.demo4;

public class Originator {

    /**
     * 原发器的状态
     */
    private String state;

    private Caretaker caretaker = new Caretaker();

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 创建备忘录，保存原发器状态
     * @return
     */
    public void createMemento(){
        Memento memento = new MementoImpl(state);
        caretaker.setMemento(memento);
    }

    /**
     * 恢复保存的状态
     */
    public void recoveryMemento(){
        MementoImpl memento = (MementoImpl) caretaker.getMemento();
        this.state = memento.getState();
    }


    /**
     * 真正的备忘录对象，实现了备忘录窄接口，实现成内部私有类，不让外部类访问
     */
    private static class MementoImpl implements Memento {

        private String state;

        public MementoImpl(String state){
            this.state = state;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

    }

}
