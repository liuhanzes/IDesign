package com.liuhanze.design_patterns.state;

/**
 * 状态模式
 * 当一个对象的状态改变时允许改变其行为，这个对象看起来像是改变了其类
 */
public class StateMain {

    public void main(){
        Work work = new Work();
        work.hour = 9;
        work.writeProgram();

        work.hour = 10;
        work.writeProgram();

        work.hour = 18;
        work.writeProgram();

        work.finishWork = true;

        work.hour = 21;
        work.writeProgram();

        work.finishWork = false;

        work.hour = 21;
        work.writeProgram();


    }
}
