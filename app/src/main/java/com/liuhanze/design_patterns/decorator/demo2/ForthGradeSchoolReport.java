package com.liuhanze.design_patterns.decorator.demo2;

import com.liuhanze.iutil.log.ILog;

class ForthGradeSchoolReport implements SchoolReport{

    @Override
    public void report() {
        ILog.LogDebug("四年级成绩单\n语文：98，数学100，英语98");
    }

    @Override
    public void sign(String name) {
        ILog.LogError("家长："+name);
    }
}
