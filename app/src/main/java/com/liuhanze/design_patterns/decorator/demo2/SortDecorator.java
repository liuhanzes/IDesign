package com.liuhanze.design_patterns.decorator.demo2;

import com.liuhanze.iutil.log.ILog;

public class SortDecorator extends Decorator{

    public SortDecorator(SchoolReport report) {
        super(report);
    }

    private void reportSort(){
        ILog.LogDebug("我是排名第二");
    }

    @Override
    public void report() {
        super.report();
        reportSort();
    }
}
