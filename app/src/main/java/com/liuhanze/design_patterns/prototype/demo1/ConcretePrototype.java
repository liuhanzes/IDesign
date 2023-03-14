package com.liuhanze.design_patterns.prototype.demo1;

public class ConcretePrototype extends Prototype{

    public ConcretePrototype(String id){
        super(id);
    }

    @Override
    public Prototype cloneObj() {
        try {
            return (Prototype) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
