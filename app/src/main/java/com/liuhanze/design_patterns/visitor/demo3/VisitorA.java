package com.liuhanze.design_patterns.visitor.demo3;

import com.liuhanze.iutil.log.ILog;

public class VisitorA implements Visitor{

    @Override
    public void visitor(ElementA elementA) {
        ILog.LogDebug("visitorA visitor elementA");
    }

    @Override
    public void visitor(ElementB elementB) {
        ILog.LogDebug("visitorA visitor elementB");
    }
}
