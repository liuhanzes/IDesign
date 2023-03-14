package com.liuhanze.design_patterns.memento.demo2;

public class GameRole {

    /**
     * 生命力
     */
    private int vit;
    /**
     * 攻击力
     */
    private int atk;
    /**
     * 防御力
     */
    private int def;

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    /**
     * 初始化状态
     */
    public void initState(){
        vit = 100;
        atk = 100;
        def = 100;
    }

    public void fight(){
        vit = 0;
        atk = 0;
        def = 0;
    }

    public RoleStateMemento saveState(){
        return new RoleStateMemento(vit,atk,def);
    }

    public void recoveryState(RoleStateMemento memento){
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }

}
