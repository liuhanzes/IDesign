package com.liuhanze.design_patterns.state;

public class NightState implements State{

    @Override
    public void writeProgram(Work work) {
        if(work.finishWork){
            System.out.printf("当前时间："+work.hour+",上午工作 精神百倍");
            work.setState(new ResetState());
            work.writeProgram();
        }else{
            if(work.hour > 21){
                System.out.printf("当前时间："+work.hour+",加班工作");
            }else{
                work.setState(new SleepWorkState());
                work.writeProgram();
            }
        }
    }
}
