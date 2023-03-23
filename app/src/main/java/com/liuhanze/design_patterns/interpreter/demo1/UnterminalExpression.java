package com.liuhanze.design_patterns.interpreter.demo1;

import com.liuhanze.iutil.log.ILog;

public class UnterminalExpression extends AbstractExpression{

    @Override
    void interpret(MContext context) {
        ILog.LogDebug("非终结表达式");
    }
}
