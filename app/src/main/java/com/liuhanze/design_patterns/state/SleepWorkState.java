package com.liuhanze.design_patterns.state;

public class SleepWorkState implements State{

    @Override
    public void writeProgram(Work work) {
        System.out.printf("当前时间："+work.hour+",加班中，快睡着了");
    }
}
