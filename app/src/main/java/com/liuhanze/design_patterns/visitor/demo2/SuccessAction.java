package com.liuhanze.design_patterns.visitor.demo2;

import com.liuhanze.iutil.log.ILog;

public class SuccessAction implements Action{

    @Override
    public void getManConclusion(Man man) {
        ILog.LogDebug("男人《成功》的背后都有一个伟大的女人");
    }

    @Override
    public void getWomanManConclusion(Woman woman) {
        ILog.LogDebug("女人《成功》的背后都有一个没用的男人");

    }
}
