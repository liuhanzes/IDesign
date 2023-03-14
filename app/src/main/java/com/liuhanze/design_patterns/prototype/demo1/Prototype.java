package com.liuhanze.design_patterns.prototype.demo1;

public abstract class Prototype implements Cloneable{

    private String id;
    public Prototype(String id){
        this.id = id;
    }

    public String getID(){
        return id;
    }

    public abstract Prototype cloneObj();
}
