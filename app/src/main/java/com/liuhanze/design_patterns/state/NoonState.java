package com.liuhanze.design_patterns.state;

public class NoonState implements State{

    @Override
    public void writeProgram(Work work) {
        if(work.hour < 13){
            System.out.printf("当前时间："+work.hour+",午饭时间");
        }else{
            work.setState(new AfterNoonState());
            work.writeProgram();
        }
    }
}
