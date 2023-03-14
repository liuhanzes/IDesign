package com.liuhanze.design_patterns.state;

public class ForenoonState implements State{

    @Override
    public void writeProgram(Work work) {
        if(work.hour < 12){
            System.out.printf("当前时间："+work.hour+",上午工作 精神百倍");
        }else{
            work.setState(new NoonState());
            work.writeProgram();
        }
    }
}
