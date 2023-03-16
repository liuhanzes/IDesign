package com.liuhanze.design_patterns.visitor.demo3;

import com.liuhanze.iutil.log.ILog;

public class VisitorB implements Visitor{

    @Override
    public void visitor(ElementA elementA) {
        ILog.LogDebug("VisitorB visitor elementA");
    }

    @Override
    public void visitor(ElementB elementB) {
        ILog.LogDebug("VisitorB visitor elementB");

    }
}
