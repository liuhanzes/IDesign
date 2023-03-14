package com.liuhanze.design_patterns.proxy.demo2;

import com.liuhanze.iutil.log.ILog;

public class Pursuit implements IGiveGift{

    SchoolGirl schoolGirl;

    public Pursuit(SchoolGirl schoolGirl){
        this.schoolGirl = schoolGirl;
    }


    @Override
    public void giveFlowers() {
        ILog.LogDebug(schoolGirl.getName()+"送你花花");
    }

    @Override
    public void giveDolls() {
        ILog.LogDebug(schoolGirl.getName()+"送你洋娃娃");

    }

    @Override
    public void giveChocolate() {
        ILog.LogDebug(schoolGirl.getName()+"送你巧克力");

    }
}
