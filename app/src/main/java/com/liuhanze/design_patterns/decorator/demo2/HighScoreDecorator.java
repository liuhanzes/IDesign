package com.liuhanze.design_patterns.decorator.demo2;

import com.liuhanze.iutil.log.ILog;

public class HighScoreDecorator extends Decorator{

    public HighScoreDecorator(SchoolReport report) {
        super(report);
    }

    private void reportHighScore(){
        ILog.LogWarn("最高成绩是语文：100，数学：120，英语：120");
    }

    @Override
    public void report() {
        reportHighScore();
        super.report();
    }
}
