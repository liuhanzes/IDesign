package com.liuhanze.design_patterns.visitor.demo2;

import com.liuhanze.iutil.log.ILog;

public class Marriage implements Action{

    @Override
    public void getManConclusion(Man man) {
        ILog.LogDebug("男人《结婚》有妻徒刑 ");

    }

    @Override
    public void getWomanManConclusion(Woman woman) {
        ILog.LogDebug("女人《结婚》婚姻保平安");

    }
}
