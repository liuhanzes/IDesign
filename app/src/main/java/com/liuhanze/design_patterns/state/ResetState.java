package com.liuhanze.design_patterns.state;

public class ResetState implements State{

    @Override
    public void writeProgram(Work work) {
        System.out.printf("当前时间："+work.hour+" 下班时间 回家啦");
    }
}
