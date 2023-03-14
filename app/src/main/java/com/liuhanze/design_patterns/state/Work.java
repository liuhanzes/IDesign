package com.liuhanze.design_patterns.state;

public class Work {
    public int hour;
    private State state;
    public boolean finishWork = false;

    public Work(){
        state = new ForenoonState();
    }

    public void setState(State state){
        this.state = state;
    }

    public void writeProgram(){
        state.writeProgram(this);
    }
}
