package com.liuhanze.design_patterns.state;

public class AfterNoonState implements State{

    @Override
    public void writeProgram(Work work) {
        if(work.hour < 17){
            System.out.printf("当前时间："+work.hour+",下午犯困 效率降低");
        }else{
            work.setState(new NightState());
            work.writeProgram();
        }
    }
}
